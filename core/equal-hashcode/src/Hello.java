import java.util.Objects;

/**
 * @author manhdt14
 * created in 12/22/2022 3:00 PM
 */

public class Hello {
    public static void checkEquals() {
        String s1 = "Manh";
        String s2 = "Manh";

        System.out.println(s1.equals(s2)); // true

        System.out.println("s1 hashcode " + s1.hashCode()); // hashcode: 2390638
        System.out.println("s2 hashcode " + s2.hashCode()); // hashcode: 2390638

        /**
         * equals là một phương thức vì vậy, khi so sánh với null: null.equals(othervalue) sẽ báo lỗi NullPointerException
         * vì vậy, khi so sánh null, chúng ta dùng == operator, chứ không dùng equals
         * https://stackoverflow.com/questions/4501061/java-null-check-why-use-instead-of-equals
         */
        String s3 = null;
        System.out.println(s1.equals(null));
        // System.out.println(s3.equals(s1)); // error

        Integer int1 = new Integer(1);
        Number number1 = new Double(1);
        System.out.println("int1(hashcode) " + int1.hashCode() +" number1(hashcode) "+ number1.hashCode());
        // mặc dù Integer extends Number, nó vẫn trả về false
        System.out.println(int1.equals(number1)); // false
        System.out.println(number1.equals(int1)); // false

        // truòng hợp class người dùng định nghĩa
        Money income = new Money(55, "USD");
        Money expenses = new Money(55, "USD");

        boolean balanced = income.equals(expenses); // expenses.equals(income) bằng nhau, true
        System.out.println("balanced: " + balanced);

        // trường hơp class kế thừa nhau
        // vi phạm tính đối xứng, sửa nó bằng Composition over Inheritance
        System.out.println("trước khi dùng favor composition over inheritance:");

        Money cash = new Money(42, "USD");
        WrongVoucher voucher = new WrongVoucher(42, "USD", "Amazon");
        // bằng true là do nó dùng hàm equals của Cash, trong đấy chỉ có 2 thuộc tính thôi, mà 2 thuộc tính này giữa 2
        // class giống nhau về giá trị
        cash.equals(voucher);
        System.out.println(cash.equals(voucher)); // => true, không thoả mãn tính đối xứng
        System.out.println(voucher.equals(cash)); // => false, như mong đợi

        // sau khi dùng favor composition over inheritance
        System.out.println("sau khi dùng favor composition over inheritance:");
        Money cash1 = new Money(42, "USD");
        Voucher voucher1 = new Voucher(42, "USD", "Amazon");
        cash1.equals(voucher1);
        System.out.println(cash1.equals(voucher1)); // false , khắc phục violation của cái trên
        System.out.println(voucher1.equals(cash1)); // false
    }

    public static void checkInstanceof() {
        // instanceof (là một nội dung trong equals) https://www.programiz.com/java-programming/instanceof
        // downcasting: kiểu của lớp con tham chiếu tới
        // có 3 cách

        //1 Dog d = new Animal(); // compiler error

        //2 sử dụng ép kiểu
        // Dog dog = (Dog) new Animal(); // runtime error, ClassCastException

        //3 sử dụng instanceof
        Animal a = new Animal();
        Dog dog = Dog.method(a);
        System.out.println(a.getClass());
        System.out.println(dog.getClass());
        System.out.println(a.equals(dog)); // false

        System.out.println(dog instanceof Animal);
        System.out.println(dog.getClass().equals(a.getClass()));
    }

    public static void checkHashCode() {
        // https://www.baeldung.com/java-equals-hashcode-contracts
        // https://www.baeldung.com/java-hashcode
        String s1 = "Manh";
        String s2 = "Manh";
        System.out.println("hashcode:" + s1.hashCode());
        System.out.println("hashcode:" + s2.hashCode());
        System.out.println(s1.hashCode() == s2.hashCode());

        // với class do người dùng định nghĩa, khi mà ghi đè phương thức equal nhưng không ghi đè phương thức hashcode
        Money income = new Money(55, "USD");
        Money expenses = new Money(55, "USD");
        System.out.println("hashcode money if don't override hashcode");
        // income.equals(expenses) == true, nhưng hashcode lại khác nhau, sai logic
        System.out.println("hashcode:" + income.hashCode());
        System.out.println("hashcode:" + expenses.hashCode());

        System.out.println("override hashcode method");
        MoneyHashCode income2 = new MoneyHashCode(55, "USD");
        MoneyHashCode expenses2 = new MoneyHashCode(55, "USD");
        System.out.println("hashcode:" + income2.hashCode());
        System.out.println("hashcode:" + expenses2.hashCode());
        System.out.println(income2.hashCode() == expenses2.hashCode()); // true, đã đúng logic
    }

    public static void test() {
        // kiểm tra xem hai thể hiện của một class mà không override phương thức equal và hashcode thì hashcode của nó sẽ
        // thế nào
        A1 a1 = new A1();
        B1 b1 = new B1();

        System.out.println(a1.hashCode());
        System.out.println(b1.hashCode());

        System.out.println(a1.equals(b1));

    }
    public static void main(String[] args) {
//        checkEquals();
//        checkInstanceof();
        checkHashCode();
//        test();

    }
}

class Animal {}

class Dog extends Animal {
    static Dog method(Animal a) {
        Dog d = new Dog();
        if (a instanceof Dog) {
            d = (Dog)a; // downcasting
        }
        return d;
    }
}

class A1 {

}

class B1 {

}
/**
 * @author manhdt14
 * created in 12/21/2022 8:57 PM
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
//        không gọi được vì constructor của Class là private
//        SingleObject object = new SingleObject();

        // Get the only object available
        // áp dụng singleton design patter
        SingleObject object = SingleObject.getInstance("ONE");
        SingleObject object2 = SingleObject.getInstance("TWO");
        System.out.println("object         " + object.value); // One
        System.out.println("another object " + object2.value);// One

        object.showMessage();
    }
}

package pub; /**
 * @author manhdt14
 * created in 12/21/2022 8:18 PM
 */

/**
 * thứ tự gọi của các constructor không quan trọng, có thể điều chỉnh được, tuân theo quy tắc đệ quy
 * default access modifier là package
 */
public class Temp {
    // default constructor 1
    // default constructor will call another constructor
    // using this keyword from same class
    Temp() {
        // calls constructor 2
        this(5);
        System.out.println("The Default constructor");
    }

    // parameterized constructor 2
    Temp(int x) {
        // calls constructor 3
        this(5, 15);
        System.out.println(x);
    }

    // parameterized constructor 3
    Temp(int x, int y) {
        System.out.println(x * y);
    }

    public static void main(String args[]) {
        // invokes default constructor first
        new Temp();
    }
}

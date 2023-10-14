package pub;

/**
 * @author manhdt14
 * created in 12/21/2022 8:21 PM
 */
// Java program to illustrate Constructor Chaining
// within same class Using this() keyword
// and changing order of constructors
class Temp1 {
    // default constructor 1
    Temp1() {
        System.out.println("default");
    }

    // parameterized constructor 2
    Temp1(int x) {
        // invokes default constructor
        this();
        System.out.println(x);
    }

    // parameterized constructor 3
    Temp1(int x, int y) {
        // invokes parameterized constructor 2
        this(5);
        System.out.println(x * y);
    }

    public static void main(String args[]) {
        // invokes parameterized constructor 3
        new Temp1(8, 10);
    }
}

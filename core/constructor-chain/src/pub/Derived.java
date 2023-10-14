package pub;

/**
 * @author manhdt14
 * created in 12/21/2022 8:25 PM
 */

class Base {
    String name;

    // constructor 1
    public Base() {
        this("");
        System.out.println("No-argument constructor of" +
                " base class");
    }

    // constructor 2
    public Base(String name) {
        this.name = name;
        System.out.println("Calling parameterized constructor"
                + " of base");
    }
}

public class Derived extends Base {
    // constructor 3
    public Derived() {
        System.out.println("No-argument constructor " +
                "of derived");
    }

    // parameterized constructor 4
    public Derived(String name) {
        // invokes base class constructor 2
        super(name);
        System.out.println("Calling parameterized " +
                "constructor of derived");
    }

}

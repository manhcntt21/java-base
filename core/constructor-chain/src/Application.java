import pri.DelegatedConstructor;
import pub.Derived;

/**
 * @author manhdt14
 * created in 1/7/2023 1:03 PM
 */
public class Application {
    public static void main(String[] args) {
        //1. call directly private constructor
//        pri.PrivateConstructor privateConstructor = new pri.PrivateConstructor(); // complier error
        //2. delegate constructor
//        DelegatedConstructor d = new DelegatedConstructor();
//        DelegatedConstructor d1 = new DelegatedConstructor("DB Copper");
//        DelegatedConstructor d2 = new DelegatedConstructor(20);
//        DelegatedConstructor d3 = new DelegatedConstructor("DB Copper", 50);
        //3. construtor with super
        // Calls No-argument constructor
//        Derived obj2 = new Derived();

        // calls parameterized constructor 4
//        Derived obj1 = new Derived("test");
    }
}

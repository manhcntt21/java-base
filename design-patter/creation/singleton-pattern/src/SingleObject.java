/**
 * @author manhdt14
 * created in 12/21/2022 8:55 PM
 */
// lazy initialization
public class SingleObject {
    //create an object of SingleObject
    private static SingleObject instance;
    public String value;
    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObject(String value) {
        this.value = value;
    }

    //Get the only object available
    public static SingleObject getInstance(String value) {
        if (instance == null) {
            instance  = new SingleObject(value);
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}

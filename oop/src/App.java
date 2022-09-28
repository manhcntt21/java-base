/**
 * @author manhdt14
 * created in 9/29/2022 12:29 AM
 */
public class App {
    public static void main(String[] args) {
            Vehicle v = new Vehicle();
            v.run();

            Vehicle v1 = new Car();
            Vehicle v2 = new Bike();
            v1.run();
            v2.run();
    }
}

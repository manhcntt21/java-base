package d.entities;

/**
 * @author manhdt14
 * created in 9/29/2022 8:33 AM
 */
public class Customer {
    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + '}';
    }
}

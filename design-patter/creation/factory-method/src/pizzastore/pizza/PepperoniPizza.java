package pizzastore.pizza;

/**
 * @author manhdt14
 * created in 9/26/2023 4:31 PM
 */
public class PepperoniPizza extends Pizza{
    public PepperoniPizza() {
        this.name = "pepperoni";
    }

    @Override
    public void prepare() {

    }

    @Override
    public void bake() {

    }

    @Override
    public void cut() {

    }

    @Override
    public void box() {

    }

    @Override
    public String toString() {
        return name;
    }
}

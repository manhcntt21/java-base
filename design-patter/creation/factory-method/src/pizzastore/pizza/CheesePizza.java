package pizzastore.pizza;

/**
 * @author manhdt14
 * created in 9/26/2023 4:30 PM
 */
public class CheesePizza extends Pizza {
    public CheesePizza() {
        this.name = "cheese";
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

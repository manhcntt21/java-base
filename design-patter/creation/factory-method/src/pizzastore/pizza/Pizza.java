package pizzastore.pizza;

/**
 * @author manhdt14
 * created in 9/26/2023 4:26 PM
 */
public abstract class Pizza {
    public String name;
    public abstract void prepare();

    public abstract void bake();

    public abstract void cut();

    public abstract void box();
}

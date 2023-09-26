package pizzastore.pizza;

import java.util.ArrayList;

/**
 * @author manhdt14
 * created in 9/26/2023 4:26 PM
 */
public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("PREPARE: " + name);
        System.out.println("TOSSING DOUGH: " + dough);
        System.out.println("ADDING SAUCE: " + sauce);
        System.out.println("ADDING TOPPINGS: ");
        toppings.forEach(topping-> System.out.println("     " + topping));
    }

    public void bake() {
        System.out.println("BAKE: bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("CUT: cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("BOX: place pizza in official in PizzaStore box");
    }
}

package pizza;

import java.util.List;

/**
 * @author manhdt14
 * created in 1/26/2023 6:17 PM
 */
public class Pizza {
    String name;
    List<String> toppings;

    public void addToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public void setName(String name) {
        this.name = name;
    }

    void prepare() {
        System.out.println("Prepare " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cut the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + this.name + " ----\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }
}

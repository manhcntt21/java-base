package pizzastore.pizza.newyork;

import pizzastore.pizza.Pizza;

/**
 * @author manhdt14
 * created in 9/26/2023 4:30 PM
 */
public class NewYorkStyleCheesePizza extends Pizza {
    public NewYorkStyleCheesePizza() {
        name = "new york style cheese";
        dough = "thin crust dough";
        sauce = "marinara sauce";
        toppings.add("grated reggiano cheese");
    }

    @Override
    public String toString() {
        return name;
    }
}

package pizzastore.pizza.chicago;

import pizzastore.pizza.Pizza;

/**
 * @author manhdt14
 * created in 9/26/2023 4:30 PM
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "chicago style cheese";
        dough = "extra thick crust dough";
        sauce = "plum tomato sauce";
        toppings.add("shredded mozzarella cheese");
    }

    @Override
    public String toString() {
        return name;
    }
}

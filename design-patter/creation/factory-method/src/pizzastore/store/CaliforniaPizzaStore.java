package pizzastore.store;

import pizzastore.pizza.Pizza;
import pizzastore.pizza.california.CaliforniaStyleCheesePizza;
import pizzastore.pizza.california.CaliforniaStyleGreekPizza;
import pizzastore.pizza.california.CaliforniaStylePepperoniPizza;

/**
 * @author manhdt14
 * created in 9/26/2023 10:21 PM
 */
public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new CaliforniaStyleCheesePizza();
            case "pepperoni" -> new CaliforniaStylePepperoniPizza();
            case "greek" -> new CaliforniaStyleGreekPizza();
            default -> throw new IllegalArgumentException("invalid type");
        };
    }
}

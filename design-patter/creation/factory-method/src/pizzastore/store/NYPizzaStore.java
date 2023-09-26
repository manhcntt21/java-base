package pizzastore.store;

import pizzastore.pizza.Pizza;
import pizzastore.pizza.newyork.NewYorkStyleCheesePizza;
import pizzastore.pizza.newyork.NewYorkStyleGreekPizza;
import pizzastore.pizza.newyork.NewYorkStylePepperoniPizza;

/**
 * @author manhdt14
 * created in 9/26/2023 10:20 PM
 */
public class NYPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new NewYorkStyleCheesePizza();
            case "pepperoni" -> new NewYorkStylePepperoniPizza();
            case "greek" -> new NewYorkStyleGreekPizza();
            default -> throw new IllegalArgumentException("invalid type");
        };
    }
}

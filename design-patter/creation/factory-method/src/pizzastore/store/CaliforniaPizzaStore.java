package pizzastore.store;

import pizzastore.factory.CaliforniaIngredientFactory;
import pizzastore.pizza.CheesePizza;
import pizzastore.pizza.PepperoniPizza;
import pizzastore.pizza.Pizza;

/**
 * @author manhdt14
 * created in 9/26/2023 10:21 PM
 */
public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        CaliforniaIngredientFactory californiaIngredientFactory = new CaliforniaIngredientFactory();
        return switch (type) {
            case "cheese" -> new CheesePizza(californiaIngredientFactory);
            case "pepperoni" -> new PepperoniPizza(californiaIngredientFactory);
            default -> throw new IllegalArgumentException("invalid type");
        };
    }
}

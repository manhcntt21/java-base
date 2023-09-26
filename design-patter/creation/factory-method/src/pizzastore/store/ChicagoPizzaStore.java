package pizzastore.store;

import pizzastore.factory.ChicagoIngredientFactory;
import pizzastore.pizza.CheesePizza;
import pizzastore.pizza.PepperoniPizza;
import pizzastore.pizza.Pizza;

/**
 * @author manhdt14
 * created in 9/26/2023 10:20 PM
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        ChicagoIngredientFactory chicagoIngredientFactory = new ChicagoIngredientFactory();
        return switch (type) {
            case "cheese" -> new CheesePizza(chicagoIngredientFactory);
            case "pepperoni" -> new PepperoniPizza(chicagoIngredientFactory);
            default -> throw new IllegalArgumentException("invalid type");
        };
    }
}

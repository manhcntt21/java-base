package pizzastore.store;

import pizzastore.pizza.Pizza;
import pizzastore.pizza.chicago.ChicagoStyleCheesePizza;
import pizzastore.pizza.chicago.ChicagoStyleGreekPizza;
import pizzastore.pizza.chicago.ChicagoStylePepperoniPizza;

/**
 * @author manhdt14
 * created in 9/26/2023 10:20 PM
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            case "pepperoni" -> new ChicagoStylePepperoniPizza();
            case "greek" -> new ChicagoStyleGreekPizza();
            default -> throw new IllegalArgumentException("invalid type");
        };
    }
}

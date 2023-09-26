package pizzastore.store;

import pizzastore.factory.NYPizzaIngredientFactory;
import pizzastore.pizza.CheesePizza;
import pizzastore.pizza.PepperoniPizza;
import pizzastore.pizza.Pizza;

/**
 * @author manhdt14
 * created in 9/26/2023 10:20 PM
 */
public class NYPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        NYPizzaIngredientFactory nyPizzaIngredientFactory = new NYPizzaIngredientFactory();
        Pizza pizza = null;
        switch (type) {
            case "cheese" -> {
                pizza = new CheesePizza(nyPizzaIngredientFactory);
                pizza.setName("New York Style Cheese Pizza");
            }
            case "pepperoni" -> {
                pizza = new PepperoniPizza(nyPizzaIngredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
            }
            default -> throw new IllegalArgumentException("invalid type");
        };
        return pizza;
    }
}

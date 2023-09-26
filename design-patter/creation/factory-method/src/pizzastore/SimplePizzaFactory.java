package pizzastore;

import pizzastore.pizza.CheesePizza;
import pizzastore.pizza.GreekPizza;
import pizzastore.pizza.PepperoniPizza;
import pizzastore.pizza.Pizza;

/**
 * @author manhdt14
 * created in 9/26/2023 4:32 PM
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza;
        if(type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if(type.equals("greek")) {
            pizza = new GreekPizza();
        } else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        } else {
            throw new IllegalArgumentException();
        }
        return pizza;
    }
}

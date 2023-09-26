package pizzastore;

import pizzastore.pizza.CheesePizza;
import pizzastore.pizza.GreekPizza;
import pizzastore.pizza.PepperoniPizza;
import pizzastore.pizza.Pizza;

/**
 * @author manhdt14
 * created in 9/26/2023 4:44 PM
 */
public class PizzaStore {
    private SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.factory = simplePizzaFactory;
    }

    Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public static void main(String[] args) {
        PizzaStore ps = new PizzaStore(new SimplePizzaFactory());
        Pizza cheese = ps.orderPizza("cheese");
        System.out.println(cheese.toString());

        Pizza greek = ps.orderPizza("greek");
        System.out.println(greek.toString());
    }
}

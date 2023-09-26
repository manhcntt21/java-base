package pizzastore;

import pizzastore.pizza.Pizza;
import pizzastore.store.ChicagoPizzaStore;
import pizzastore.store.NYPizzaStore;
import pizzastore.store.PizzaStore;

/**
 * @author manhdt14
 * created in 9/26/2023 10:57 PM
 */
public class PizzaDriver {
    public static void main(String[] args) {
        PizzaStore joel = new ChicagoPizzaStore();
        PizzaStore ethan = new NYPizzaStore();

        Pizza joelPizza = joel.orderPizza("cheese");
        Pizza ethanPizza = ethan.orderPizza("cheese");

        System.out.println(joelPizza);
        System.out.println(ethanPizza);
    }
}

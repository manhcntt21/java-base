package pizzastore;

import pizzastore.store.NYPizzaStore;
import pizzastore.store.PizzaStore;

/**
 * @author manhdt14
 * created in 9/26/2023 10:57 PM
 */
public class PizzaDriver {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");
    }
}

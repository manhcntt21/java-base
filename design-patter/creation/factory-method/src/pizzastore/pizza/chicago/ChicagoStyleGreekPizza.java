package pizzastore.pizza.chicago;

import pizzastore.pizza.Pizza;

/**
 * @author manhdt14
 * created in 9/26/2023 4:31 PM
 */
public class ChicagoStyleGreekPizza extends Pizza {
    public ChicagoStyleGreekPizza() {
        this.name = "chicago style greek";
    }

    @Override
    public String toString() {
        return name;
    }
}

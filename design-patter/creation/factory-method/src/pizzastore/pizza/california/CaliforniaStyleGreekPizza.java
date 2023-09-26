package pizzastore.pizza.california;

import pizzastore.pizza.Pizza;

/**
 * @author manhdt14
 * created in 9/26/2023 4:31 PM
 */
public class CaliforniaStyleGreekPizza extends Pizza {
    public CaliforniaStyleGreekPizza() {
        this.name = "california style greek";
    }

    @Override
    public String toString() {
        return name;
    }
}

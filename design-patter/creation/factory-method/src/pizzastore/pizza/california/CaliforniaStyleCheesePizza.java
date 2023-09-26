package pizzastore.pizza.california;

import pizzastore.pizza.Pizza;

/**
 * @author manhdt14
 * created in 9/26/2023 4:30 PM
 */
public class CaliforniaStyleCheesePizza extends Pizza {
    public CaliforniaStyleCheesePizza() {
        this.name = "california style cheese";
    }

    @Override
    public String toString() {
        return name;
    }
}

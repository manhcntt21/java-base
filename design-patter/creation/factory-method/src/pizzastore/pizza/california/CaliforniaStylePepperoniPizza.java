package pizzastore.pizza.california;

import pizzastore.pizza.Pizza;

/**
 * @author manhdt14
 * created in 9/26/2023 4:31 PM
 */
public class CaliforniaStylePepperoniPizza extends Pizza {
    public CaliforniaStylePepperoniPizza() {
        this.name = "california style pepperoni";
    }

    @Override
    public String toString() {
        return name;
    }
}

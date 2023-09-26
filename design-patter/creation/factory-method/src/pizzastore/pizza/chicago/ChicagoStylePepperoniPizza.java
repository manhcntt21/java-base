package pizzastore.pizza.chicago;

import pizzastore.pizza.Pizza;

/**
 * @author manhdt14
 * created in 9/26/2023 4:31 PM
 */
public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        this.name = "chicago style pepperoni";
    }

    @Override
    public String toString() {
        return name;
    }
}

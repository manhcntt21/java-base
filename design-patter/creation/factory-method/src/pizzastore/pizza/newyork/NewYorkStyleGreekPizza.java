package pizzastore.pizza.newyork;

import pizzastore.pizza.Pizza;

/**
 * @author manhdt14
 * created in 9/26/2023 4:31 PM
 */
public class NewYorkStyleGreekPizza extends Pizza {
    public NewYorkStyleGreekPizza() {
        this.name = "new york style greek";
    }

    @Override
    public String toString() {
        return name;
    }
}

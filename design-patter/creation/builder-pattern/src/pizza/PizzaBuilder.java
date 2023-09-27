package pizza;

import java.util.ArrayList;
import java.util.List;

/**
 * @author manhdt14
 * created in 1/26/2023 6:13 PM
 */
public abstract class PizzaBuilder {
    String name;
    List<String> toppings = new ArrayList<String>();

    public abstract PizzaBuilder addCheese();
    public abstract PizzaBuilder addSauce();
    public abstract PizzaBuilder addTomatoes();
    public abstract PizzaBuilder addGarlic();
    public abstract PizzaBuilder addOlives();
    public abstract PizzaBuilder addSpinach();
    public abstract PizzaBuilder addPepperoni();
    public abstract PizzaBuilder addSausage();

    public Pizza build() {
        Pizza pizza = new Pizza();
        pizza.setName(this.name);
        pizza.addToppings(toppings);
        return pizza;
    }
}

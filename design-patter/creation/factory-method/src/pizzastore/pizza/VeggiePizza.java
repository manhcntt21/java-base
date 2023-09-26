package pizzastore.pizza;

import pizzastore.factory.PizzaIngredientFactory;

/**
 * @author manhdt14
 * created in 9/27/2023 1:04 AM
 */
public class VeggiePizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    @Override
    public void prepare() {

    }
}

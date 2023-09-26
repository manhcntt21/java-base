package pizzastore.factory;

import pizzastore.ingredient.*;
import pizzastore.ingredient.dough.ThinCrustDough;
import pizzastore.ingredient.sauce.PlumTomatoSauce;

/**
 * @author manhdt14
 * created in 9/27/2023 12:38 AM
 */
public class ChicagoIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Clams createClams() {
        return null;
    }
}

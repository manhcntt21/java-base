package pizzastore.factory;

import pizzastore.ingredient.*;
import pizzastore.ingredient.cheese.ReggianoCheese;
import pizzastore.ingredient.clam.FreshClams;
import pizzastore.ingredient.dough.ThinCrustDough;
import pizzastore.ingredient.pepperoni.SlicedPepperoni;
import pizzastore.ingredient.sauce.MarinaraSauce;
import pizzastore.ingredient.veggie.Garlic;
import pizzastore.ingredient.veggie.Mushroom;
import pizzastore.ingredient.veggie.Onion;
import pizzastore.ingredient.veggie.RedPepper;

/**
 * @author manhdt14
 * created in 9/27/2023 12:38 AM
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}

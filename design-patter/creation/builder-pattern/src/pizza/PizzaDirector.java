package pizza;

/**
 * @author manhdt14
 * created in 1/26/2023 6:27 PM
 */
public class PizzaDirector {
    public static void main(String[] args) {
        PizzaBuilder veggieBuilder = new VeggieLoversPizzaBuilder();
        Pizza veggie = veggieBuilder.addSauce().addCheese().addOlives().addTomatoes().addSausage().build();
        veggie.prepare();
        veggie.bake();
        veggie.cut();
        veggie.box();
        System.out.println(veggie);

        PizzaBuilder meatBuilder = new MeatLoversPizzaBuilder();
        Pizza meat = meatBuilder.addSauce().addTomatoes().addCheese().addSausage().addPepperoni().build();
        meat.prepare();
        meat.bake();
        meat.cut();
        meat.box();
        System.out.println(meat);
    }
}

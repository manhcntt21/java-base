package l;

import l.fix.Car;
import l.fix.Engine;

/**
 * @author manhdt14
 * created in 9/29/2022 3:11 AM
 */
public class ElectricCar extends Car {
    private Engine engine;

    public ElectricCar(int mileage) {
        super(mileage);
    }


    @Override
    public void accelerate() {
        //this acceleration is crazy!
        engine.powerOn(999);
    }

    @Override
    protected void brake() {
        engine.stop();
    }
}

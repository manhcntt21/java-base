package l;

import l.Car;
import l.fix.Engine;

/**
 * @author manhdt14
 * created in 9/29/2022 3:11 AM
 */
public class ElectricCar implements Car {
    private Engine engine;


    @Override
    public void turnOnEngine() throws Exception {
        throw new Exception("Electric Car does not turn on Engine");
    }

    @Override
    public void accelerate() {
        //this acceleration is crazy!
        engine.powerOn(999);
    }
}

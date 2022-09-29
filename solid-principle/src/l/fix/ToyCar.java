package l.fix;

/**
 * @author manhdt14
 * created in 9/29/2022 3:22 AM
 */
public class ToyCar extends FuelCar{
    private Engine engine;

    public ToyCar(int mileage) {
        super(mileage);
    }

    protected void turnOnEngine() {
        engine.on();
    }

    protected void accelerate() {
        engine.powerOn(999);
    }

    protected void brake() {
        engine.stop();
    }

    public void reset() {
        mileage = 0;
    }
}

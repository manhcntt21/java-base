package l.fix;

/**
 * @author manhdt14
 * created in 9/29/2022 3:20 AM
 */
public class MotorCar extends FuelCar{
    private Engine engine;

    public MotorCar(int mileage) {
        super(mileage);
    }

    @Override
    protected void turnOnEngine() {
        // Start MotorCar
        engine.on();
    }

    @Override
    // postcondition: speed < limit
    protected void accelerate() {
        // Accelerate MotorCar
        engine.powerOn(999);
    }

    @Override
    // postcondition: speed must reduce
    protected void brake() {
        // Apply MotorCar brake
        engine.stop();
    }
}

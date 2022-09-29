package l.fix;

/**
 * @author manhdt14
 * created in 9/29/2022 3:49 AM
 */
public abstract class FuelCar extends Car{

    public FuelCar(int mileage) {
        super(mileage);
    }

    protected abstract void turnOnEngine();
}

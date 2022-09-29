package l.fix;

/**
 * @author manhdt14
 * created in 9/29/2022 3:15 AM
 */
public abstract class Car {
    protected int limit;

    // invariant: speed < limit;
    protected int speed;

    // Allowed to be set once at the time of creation.
    // Value can only increment thereafter.
    // Value cannot be reset.
    protected int mileage;

    // tong so quang duong da di duoc
    public Car(int mileage) {
        this.mileage = mileage;
    }

    // postcondition: speed < limit
    protected abstract void accelerate();

    // postcondition: speed must reduce
    protected abstract void brake();
}

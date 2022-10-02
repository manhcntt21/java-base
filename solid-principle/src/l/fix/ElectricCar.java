package l.fix;

/**
 * @author manhdt14
 * created in 9/29/2022 3:17 AM
 */
public class ElectricCar extends Car{

    public ElectricCar(int mileage) {
        super(mileage);
    }


    @Override
    protected void accelerate() {
        // this acceleration is crazy!
    }

    @Override
    protected void brake() {
        // Apply ElectricCar brake
    }
}
// có thể tạo thêm một số loại xe điện kế thừa từ class này
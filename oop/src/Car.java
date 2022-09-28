/**
 * @author manhdt14
 * created in 9/29/2022 12:27 AM
 */
public class Car extends Vehicle {
    private Integer numberWheel;

    public Car(Integer year, Integer price, String model, Integer numberWheel) {
        super(year, price, model);
        this.numberWheel = numberWheel;
    }

    public Car() {

    }

    public Integer getNumberWheel() {
        return numberWheel;
    }

    public void setNumberWheel(Integer numberWheel) {
        this.numberWheel = numberWheel;
    }

    @Override
    public void run() {
        System.out.println("Car running!");
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberWheel=" + numberWheel +
                '}';
    }
}

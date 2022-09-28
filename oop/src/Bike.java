/**
 * @author manhdt14
 * created in 9/29/2022 1:04 AM
 */
public class Bike extends Vehicle {
    private String bicycleChainColor;

    public Bike(String bicycleChainColor) {
        this.bicycleChainColor = bicycleChainColor;
    }

    public Bike() {

    }

    public String getBicycleChainColor() {
        return bicycleChainColor;
    }

    public void setBicycleChainColor(String bicycleChainColor) {
        this.bicycleChainColor = bicycleChainColor;
    }

    @Override
    public void run() {
        System.out.println("bike running");
    }
}

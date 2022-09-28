/**
 * @author manhdt14
 * created in 9/29/2022 12:50 AM
 */
public class Vehicle {
    private Integer year;
    private Integer price;
    private String model;

    public Vehicle(Integer year, Integer price, String model) {
        this.year = year;
        this.price = price;
        this.model = model;
    }

    public Vehicle() {

    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void run() {
        System.out.println("running!");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "year=" + year +
                ", price=" + price +
                ", model='" + model + '\'' +
                '}';
    }
}

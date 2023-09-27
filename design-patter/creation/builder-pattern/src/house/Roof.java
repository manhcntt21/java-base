package house;

/**
 * @author manhdt14
 * created in 1/26/2023 6:42 PM
 */
public class Roof {
    String name;
    String material;

    public Roof(String material) {
        this.name = "Roof made out of " + material;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return this.name;
    }
}

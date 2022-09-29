package o;

/**
 * @author manhdt14
 * created in 9/29/2022 3:00 AM
 */
public class GuitarFlame extends Guitar{
    // new feature
    private String flameColor;

    public GuitarFlame() {

    }

    public GuitarFlame(String make, String model, int volume, String flameColor) {
        super(make, model, volume);
        this.flameColor = flameColor;
    }

    public String getFlameColor() {
        return flameColor;
    }

    public void setFlameColor(String flameColor) {
        this.flameColor = flameColor;
    }
}

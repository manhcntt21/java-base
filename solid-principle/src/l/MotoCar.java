package l;

/**
 * @author manhdt14
 * created in 9/29/2022 3:09 AM
 */
public class MotoCar implements Car{
    private  Engine engine;
    @Override
    public void turnOnEngine() {
        engine.on();
    }

    @Override
    public void accelerate() {
        engine.powerOn(999);
    }
}

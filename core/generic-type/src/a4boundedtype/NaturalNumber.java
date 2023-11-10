package a4boundedtype;

/**
 * @author manhdt14
 * created in 12/21/2022 4:10 PM
 */
public class NaturalNumber <T extends Integer>{
    private T t;

    public NaturalNumber(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public boolean isEven() {
        return t.intValue() % 2 == 0;
    }
}

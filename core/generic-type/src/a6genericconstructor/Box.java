package a6genericconstructor;

/**
 * @author manhdt14
 * created in 12/21/2022 1:31 PM
 */
public class Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}


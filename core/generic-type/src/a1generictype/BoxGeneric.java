package a1generictype; /**
 * @author manhdt14
 * created in 12/21/2022 2:03 PM
 */

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Generic version of the Box class.
 *
 * @param <T> the type of the value being boxed
 */
public class BoxGeneric<T> {
    // T stands for "Type"
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    // generic method
    static <T> T pick(T a1, T a2) {
        return a2;
    }

    public static void main(String[] args) {
        // Invoking and Instantiating a Generic Type
        BoxGeneric<Integer> boxInteger1 = new BoxGeneric<Integer>();
        // java 7 or later
        // empty type argument, compiler determine
        BoxGeneric<Integer> boxInteger2 = new BoxGeneric<>();
        boxInteger1.set(1);

        Serializable s = pick("d", new ArrayList<String>());
        System.out.println(s.getClass());
    }
}

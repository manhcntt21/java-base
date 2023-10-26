package a2rawtype;

/**
 * @author manhdt14
 * created in 12/21/2022 3:11 PM
 */

public class Box <T>{
    private T t;
    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
    public static void main(String[] args) {
        // generic type Box<T>
        Box<Integer> intBox = new Box<>();
        // raw type of generic type Box<T>
        Box rawBox = new Box();
        rawBox.set(1);
//        System.out.println(rawBox.get());
        intBox.set(1);

        // gán raw type = parameterized type
        Box<String> stringBox1 = new Box<>();
        Box rawBox1 = stringBox1;

        // gán parameterized type = raw type => warning unchecked conversion
        Box rawbox2 = new Box();
        Box<Integer> intBox2 = rawbox2;
    }
}

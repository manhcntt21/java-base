package a4boundedtype;

/**
 * @author manhdt14
 * created in 12/21/2022 4:00 PM
 */


public class Box <T> {
    private T t;

    public Box(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public <U extends Number> void inspect(U u) {
        System.out.println(t.getClass().getName());
        System.out.println(u.getClass().getName());
    }

    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0)
                ++count;
        return count;
    }

    public static void main(String[] args) {
        Box<Integer> boxInt = new Box<>(Integer.valueOf(1));
        boxInt.inspect(1.0);
//        boxInt.inspect("some text"); // error


        NaturalNumber<Integer> naturalNumber = new NaturalNumber<>(1);
        System.out.println(naturalNumber.isEven());
//        NaturalNumber<String> // error

        Integer[] intList = new Integer[] {1,77,43,45,4};
        Integer n = 2;
        System.out.println(countGreaterThan(intList, n));
    }
}

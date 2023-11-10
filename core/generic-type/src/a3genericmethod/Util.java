package a3genericmethod;
/**
 * @author manhdt14
 * created in 12/21/2022 3:46 PM
 */
public class Util {
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p11 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(2, "pear");
        boolean same = Util.compare(p1, p11);
        System.out.println(same);
        // tương đương cái dưới
//        boolean same = Util.<Integer, String>compare(p1, p2);
    }
}

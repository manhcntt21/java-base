package a1generictype;

/**
 * @author manhdt14
 * created in 12/21/2022 2:46 PM
 */
// generic class
public class OrderedPair<K, V> implements Pair<K, V> {
    private K key;
    private V value;
    public OrderedPair() {

    }
    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public V getValue() {
        return this.value;
    }

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new OrderedPair<>("M", 1997);
//        generictype.Pair<String, Integer> p1 = new generictype.OrderedPair<String, Integer>();
        Pair<String, String> p2 = new OrderedPair<>("M", "BKHN");
//        generictype.Pair<String, String> p2 = new generictype.OrderedPair<Integer, Integer>();
        System.out.println(p1.getKey());
        System.out.println(p1.getValue());
        System.out.println(p1.getClass());

        Pair<String, BoxGeneric<Integer>> p = new OrderedPair<>("primes", new BoxGeneric<>());
        System.out.println(p.getValue().getClass());

        p.getValue().set(10);


    }
}

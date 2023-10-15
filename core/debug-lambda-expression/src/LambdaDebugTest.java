import java.util.Arrays;
import java.util.List;

/**
 * @author manhdt14
 * created in 12/23/2022 1:39 AM
 */


public class LambdaDebugTest {
    public static void main(String args[]) {
        List<String> list = Arrays.asList("jai", "adithya", "raja");
        list.stream()
                .map(s -> s + " - " + s.toUpperCase())  // Convert to upper case using lambda
                .forEach(s -> System.out.println(s));   // To print 's' using lambda
    }
}

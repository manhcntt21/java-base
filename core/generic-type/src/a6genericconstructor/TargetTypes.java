package a6genericconstructor;

import java.util.List;

/**
 * @author manhdt14
 * created in 11/11/2023 10:50 AM
 */
public class TargetTypes {
    static <T> List<T> emptyList() {
        return null;
    }

    public static void main(String[] args) {
        List<String> listOne = emptyList();
    }
}

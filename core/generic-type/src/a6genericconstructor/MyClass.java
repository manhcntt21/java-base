package a6genericconstructor;

import java.util.Collections;
import java.util.List;

/**
 * @author manhdt14
 * created in 12/21/2022 5:37 PM
 */
public class MyClass <X>{
    <T> MyClass(T t) {

    }

    static void processStringList(List<String> stringList) {
        // process stringList
    }

    public static void main(String[] args) {
        // ngầm hiểu X là Integer, T là String
        System.out.println(new MyClass<Integer>(""));
        // Collections.emptyList() trả về list<T>
        // compiler ngầm hiểu target type ở đấy là String nên T là String
        List<String> listOne = Collections.emptyList();
        // tương đương
//        List<String> listOne = Collections.<String>emptyList();

        processStringList(Collections.emptyList());
//        processStringList(Collections.<String>emptyList());

    }
}

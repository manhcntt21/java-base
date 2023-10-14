package pri;

/**
 * @author manhdt14
 * created in 10/14/2023 4:31 PM
 */
public class DelegatedConstructor {
    private String name;
    private int age;
    private String gender;// f = female, m = male, n = undefined

    private DelegatedConstructor(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        System.out.println("private constructor");
    }

    /**
     * trong tất cả các constructor, hàm this luôn phải ở đầu tiên
     */
    public DelegatedConstructor() {
        this("", 0, "N");
        System.out.println("No parameter constructor!");
    }

    public DelegatedConstructor(String name) {
        this(name, 0, "N");
        System.out.println("one parameter constructor 1!");
    }

    public DelegatedConstructor(int age) {
        this("", age, "N");
        System.out.println("one parameter constructor 2!");
    }

    public DelegatedConstructor(String name, int age) {
        this(name, age, "N");
        System.out.println("two parameters constructor!");
    }
}

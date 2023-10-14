## Constructor:
Constructor chaining là quá trình gọi một constructor từ một constructor khác, mình phân chia làm 2 loại sau, với từng loại thì biểu hiện và tác dụng của nó khác nhau

- private constructor
- public constructor
***
### Private constructor
Mục đích chính là ngăn cản khởi tạo instance từ bên ngoài class, nếu cố tình làm như vậy sẽ báo lỗi `compiler error`:

```java
import pri.PrivateConstructor;

public class Application {
    public static void main(String[] args) {
        PrivateConstructor privateConstructor = new PrivateConstructor(); // complier error
    }
}
```
Thông thường có một số lí do dể sử dụng private constructor:
- triển khai singleton design pattern để giới hạn số lượng instance của một class được khởi nhiều nhất là 1 (mình có cũng triển khai lazy singleton design pattern ở repos về [design pattern](https://github.com/manhcntt21/design-pattern))
- delegate constructor: uỷ quyền khởi tạo instance class cho những constructor khác tồn tại trong class, khi đó private constructor sẽ được sử dụng trong nội bộ class, được gọi thông qua các constructor public. Mục đích để tránh lặp code và logic, cho phép tái sử dụng các bước khởi tạo chung. Ví dụ, chúng ta không cho phép người dùng khởi tạo giá trị `gender`, và uỷ tháp việc khởi tạo instance qua các hàm constructor public
    ```java
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
    ```
- TBD
- TBD
***
### Public constructor
Constructor chaining chia làm 2 loại:
- cùng class: về hình thức giống delegate constructor trong private constructor
- khác class: liên quan đến kế thừa, khi đó constructor của derived class gọi constructor của base class thông qua `super` method

Chu ý:
- *Thứ tự khai báo constructor không quan trọng*
- *Luôn gọi constructor của lớp cha trước, nếu không khai báo thì nó gọi constructor không tham số của lớp cha*
***
### References
1. [What is constructor delegation?](https://www.linkedin.com/advice/0/how-do-you-overload-delegate-constructors#:~:text=Constructor%20delegation%20is%20the%20ability,specify%20the%20differences%20between%20constructors.)
2. [Constructor Chaining In Java with Examples](https://www.geeksforgeeks.org/constructor-chaining-java-examples/)
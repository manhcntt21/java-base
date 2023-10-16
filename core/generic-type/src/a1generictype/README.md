Generic type là một generic class or interface mà được tham số hoá theo các loại kiểu:
Ví dụ, khi một Box class không được tham số hoá, thuộc tính của nó sẽ bất kì kiểu nào thuộc Object, có thể primitive, Integer, Boolean,... mà chúng ta muốn.
```java
public class Box {
    private Object object;

    public void set(Object object) { this.object = object; }
    public Object get() { return object; }
}
```
Vấn đề đặt ra là thật khó để biết kiểu thực sử của thuộc tính, nếu chúng ta truyền vào kiểu `String` nhưng lại lấy ra theo kiểu số: `Integer`, thì nó sẽ báo lỗi `runtime error` ngay.

Vì vậy cần có một cách để quy định rõ ràng kiểu thuộc tính của trong class Box mà không phải tạo riêng lẻ mỗi class một kiểu, đó là lúc chúng ta cần đến `generic type` với hai loại:
- generic class
- generic interface

Khi đó class Box sẽ thay đổi như sau:
```java
public class BoxGeneric<T> {
    // T stands for "Type"
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
```
Về mặt convention thì T nghĩa là Type, khi đó việc tạo Box với kiểu nào đã được kiểm soát nếu truyền sai kiểu sẽ báo lỗi Compiler Error ngay.
```java
BoxGeneric<Integer> boxInteger = new BoxGeneric<Integer>();
BoxGeneric<Float> boxFloat = new BoxGeneric<Float>();
```
Với interface cũng tương tự, không khác gì nhiều, các bạn có thể xem ví dụ với [OrderedPair](OrderedPair.java), [Pair](Pair.java)
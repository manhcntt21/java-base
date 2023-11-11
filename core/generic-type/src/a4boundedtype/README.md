Đôi khi bạn muốn hạn chế các loại kiểu có thể được sử dụng như là type argument trong parameterized type

Để khai báo một bounded type parameter, sử dụng keywork `extends`, theo sau là giới hạn trên của nó. Được sử dụng trên cả method lần class

Với method:
```java
    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }
```

Với class:
```java
public class NaturalNumber <T extends Integer>{
    private T t;

    public NaturalNumber(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public boolean isEven() {
        return t.intValue() % 2 == 0;
    }
} 
```
Từ ví dụ 1 ta thấy kiểu của generic method là Number hoặc các kiểu kế thừa từ kiểu Number, nếu cố tình truyền kiểu không thuộc logic này sẽ bào lỗi syntax
```java
Box<Integer> integerBox = new Box<Integer>();
integerBox.inspect("some text"); // error:
```
*Ưu điểm của việc này thường thích hợp cho việc nhóm các kiểu với nhau để triển khai một thuật toán chung*

Ví dụ: chúng ta muốn so sanh các giá trị trong mảng đối tượng với một đối tượng cho trước

Việc triển khai như dưới đây sẽ báo lỗi vì toán từ so sánh > chỉ áp dụng cho kiểu nguyên thuỷ, không dùng toán tử này để so sánh object
```java
public static <T> int countGreaterThan(T[] anArray, T elem) {
    int count = 0;
    for (T e : anArray)
        if (e > elem)  // compiler error
            ++count;
    return count;
}
```

Để giải quyết vấn đề trên chúng ta sử bounded type parameter `Comparable<T>` (nó hỗ trợ so sánh giá trị của 2 object) để ràng buộc kiểu của method
```java
    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0) 
                ++count;
        return count;
    }
```

Sau đó tiến hành so sánh như sau
```java
        Integer[] intList = new Integer[] {1,77,43,45,4};
        Integer n = 2;
        System.out.println(countGreaterThan(intList, n));
```
***
Các ví dụ trước minh hoạt việc chỉ có một bound type parameter, ngoài ra còn có mutiple bounds, nếu một trong các kiểu là class thì ưu tiên viết lên trước, nếu không sẽ báo lỗi compile-time, vì kiểu của nó còn có thể là interface

```java
Class A { /* ... */ }
interface B { /* ... */ }
interface C { /* ... */ }

//
//
class D <T extends A & B & C> { /* ... */ } // ok

class D <T extends B & A & C> { /* ... */ }  // compile-time error
```




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




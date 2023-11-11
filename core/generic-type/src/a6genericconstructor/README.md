type inference
- khả năng của trình biên dịch Java trong việc xem xét từng lệnh gọi phương thức và khai báo tương ứng để xác định đối số kiểu

ví dụ
```java
static <T> T pick(T a1, T a2) { return a2; }
Serializable s = pick("d", new ArrayList<String>());
```
thuật toán inference dựa vào second argument được truyền vào pick() là Serializable type
***
type inference and generic method

- chúng ta khởi tạo một list với generic type `Box<Integer>` mà không cần chỉ rõ kiểu này giữa `<>` - angle bracket, trình biên dích sẽ xác định cho chúng ta  
```java
ArrayList<Box<Integer>> listOfIntegerBoxes = new ArrayList<>();
```
- khi gọi generic method `addBox` có thể gọi như phương thức thông thường như sau
```java
BoxDemo.addBox(Integer.valueOf(20), listOfIntegerBoxes);
```
mà không cần phải chỉ định rõ kiểu cho generic method như thế này
```java
BoxDemo.<Integer>addBox(Integer.valueOf(10), listOfIntegerBoxes);
```
***
type inference and instantiation of generic class
- chúng ta có thể thay thế type argument cần thiết để gọi constructor của một generic class với một tập rỗng của type parameter như `<>`, miễn là trình biên dịch có thể suy luận, nó đủ thông minh để làm điều đó

ví dụ: đây là dạng đầy đủ
```java
Map<String, List<String>> myMap = new HashMap<String, List<String>>();
```
có thể thay thế parameterized type bằng empty set of type parameter `<>` - diamond symbol
```java
Map<String, List<String>> myMap = new HashMap<>();
```

nếu chúng ta bỏ diamond đi trình biên dịch sẽ hiện cảnh bảo, vì HashMap constructor tham chiếu HashMap raw type chứ không phải generic type `Map<String, List<String>>`
```java
Map<String, List<String>> myMap = new HashMap();
```
***
type inference and generic constructor of generic class and non-generic class
- constructor có thể được generic trong cả generic class và non-generic class như sau:

trường hợp generic class
```java
public class MyClass <X> {
    <T> MyClass(T t) {

    }
}
```
trường hợp non-generic class
```java
public class MyClass {
    <T> MyClass(T t) {

    }
}
```
ví dụ khởi tạo đối tượng với generic class, compiler sẽ ngầm hiểu X là Integer và T là String và `MyClass<Integer>` là một generic type
```java
new MyClass<Integer>("")
```
***
target type
- là một data type mà Java compiler mong đợi tuỳ thuộc vào vị trí xuất hiện của biểu thức. Hãy xem xét 2 câu lệnh sau
```java
static <T> List<T> emptyList();
```
```java
List<String> listOne = Collections.emptyList();
```
câu lệnh này mong đợi instance của `List<String>` vì vậy target type ở đây là `List<String>` và T là String
câu lệnh đầy đủ sẽ là
```java
List<String> listOne = Collections.<String>emptyList();
```
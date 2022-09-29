# SOLID Principle in Java
    
1. Single Responsibility
2. Open/Close
3. Liskov Substitution
4. Interface Segregation
5. Dependency Inversion

## Single Responsibility
https://www.baeldung.com/java-single-responsibility-principle

Một class chỉ nên có một trách nghiệm hay chỉ có một lý do để thay đổi

- Testing – A class with one responsibility will have far fewer test cases.
- Lower coupling – Less functionality in a single class will have fewer dependencies.
- Organization – Smaller, well-organized classes are easier to search than monolithic ones.

Class book sẽ lưu trữ những thông tin cơ bản của bất kỳ cuốn sách nào. Chúng ta cần một phương thức nữa để in nội dung cuốn sách đó ra. Chúng ta sẽ không viết phương thức in này trong class s.GoodBook vì nó sẽ vi phạm nguyên tắc single responsibility. Chúng ta sẽ tạo ra một class mới, có nhiệm vụ in thông tin sách, ngoài ra class này còn có thể làm nhiều chức năng khác như gửi thông tin sách đến các thiết bị đa phương tiện

## Open/close
https://www.baeldung.com/java-open-closed-principle

Open cho việc thêm các tính năng mới, nhưng Close cho việc sửa tính năng cũ, vì có thể gây ra lỗi cho các hoạt động liên quan đến tính năng cũ

Sau một vài tháng, mọi người cảm thấy nhàm chán với chiếc đàn guitar hiện tại, do qua trình nghiên cứu thị trường, họ đã sáng tạo ra một cây đàn guitar hoàn toàn mới và đặt tên cho nó là Flame. FlamGuitar sẽ có những thứ mà Guitar không có, lúc này không nên sửa class Guitar, thay vào đó chúng ta nên tạo một class GuitarFlame extends class guitar

## Liskov Substitution
https://www.baeldung.com/java-liskov-substitution-principle

Được cho là phức tạp nhất trong 4 nguyên lý, nếu class A là subtype của class B, chúng ta có thể thay thế class B bằng class A mà không làm gián đoạn hoạt động của chương trình

Như trong ví dụ đã làm thay đổi hành vi của chương trình vì thêm một chiếc ô tô điện không có động cơ

Chúng ta sẽ thiết kế lại như sau, abstract class Car sẽ không chưa phương thức turnOnEngine, vì thực chất ElectricCar là một loại Car khác, ta sẽ chia Car thành 2 loại, loại chạy nhiên liệu và chạy bằng điện

Như vậy, abstract class Car chỉ chưa 2 phương thức là tăng tốc và dừng vì bất kẻ loại xe nào cũng có.

abstract Class FuelCar sẽ có thêm turnOnEngine cho các loại xe có động cơ
ElectricCar kế thức class Car, còn MotorCar và ToyCar sẽ kế thừa class FuelCar


## Interface Segregation
https://www.baeldung.com/java-interface-segregation

Giảm side effect của việc sử dụng large interface by breaking application interface into small ones, nó giống nhứ SRP
Lúc đầu Payment chỉ phục vụ BankPayment, nhưng theo thời gian, ứng dụng phát triển, nó còn phục vụ cho LoanPayment, lúc này, interface Payment không còn chỉ phục vụ một mục đích duy nhất nữa

## Dependency Inversion
https://www.baeldung.com/java-dependency-inversion-principle

Dependency inversion principle (DIP) không phải là dependency injection (DI) hay inversion of control (IOC), mặc dù chúng làm việc giống nhau

IoC là một nguyên lý của software engineering mà chuyển quyền điều khiển object sang container hoặc framework, ngược lại với traditional programming

We can achieve Inversion of Control through various mechanisms such as: Strategy design pattern, Service Locator pattern, Factory pattern, and Dependency Injection (DI).

DI là một pattern mà chúng ta dùng để implement IoC

Connecting objects with other objects, or “injecting” objects into other objects, is done by an assembler rather than by the objects themselves.

(Làm một bài về DI và IOC sau)

To understand the motivation behind the DIP, let's start with its formal definition, given by Robert C. Martin in his book, Agile Software Development: Principles, Patterns, and Practices:

- High-level modules should not depend on low-level modules. Both should depend on abstractions.
- Abstractions should not depend on details. Details should depend on abstractions.

Mặc dù triển khai lớp StringProcessor là cơ bản, nhưng chúng ta có một vài thiết kế để thực hiện ở đây

Cách 1:
- StringReader, StringWriter, low-level components, các lớp cụ thể được đặt trong cùng một gói, StringProcessor là high-level components nên được đặt ở một gói khác, không có sự đảo ngược, do StringProcessor không thể dùng trong ngữ cảnh khác

Cách 2:
- StringReader and StringWriter are interfaces placed in the same package along with the implementations, StringProcessor giờ phụ thuộc vào abstract, nhưng các thành phần low-level components thì không, chúng tôi vẫn chưa đạt được sự đảo ngược

Cách 3:
- StringReader and StringWriter are interfaces placed in the same package together with StringProcessor, StringProcessor, StringReader, and StringWriter all depend on abstractions, We have achieved inversion of dependencies from top to bottom by abstracting the interaction between the components,  StringProcessor is now reusable in a different context

Cách 4:
- StringReader and StringWriter are interfaces placed in a separate package from StringProcessor, chúng ta đạt được IoC, StringProcessor is also reusable in a different context.

Chỉ có 3 và 4 thỏa mãn DIP

4 => The abstractions are placed in a separate layer, which facilitates switching the low-level components. At the same time, all the components are isolated from each other, which yields stronger encapsulation.

Chưa hiểu rõ ví dụ lắm, tìm hiểu sau, buồn ngủ quá
Xem them: https://javatechonline.com/solid-principles-the-dependency-inversion-principle/
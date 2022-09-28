#  Kiến thức cơ bản về OOP
- Abstraction
- Encapsulation
- Inheritance
- Polymorphism

## Abstraction

Là một nội dụng trong lập trình hướng đối tượng, sử dụng những thứ đơn giản để đại diện những thứ phức tạp, để ẩn những thông tin không cần thiết, chỉ hiện thị cái khung sườn chung nhất của các đối tượng

Ví dụ, một class Vehicle thể hiện sự trừu tượng của đối tượng trong thực tế, có
- năm sản xuất
- giá
- hãng

## Encapsulation

Là một cớ chế để wrap up code như một đơn vị duy nhất (single unit). Là một quá trình ẩn thông tin chi tiết và bảo vệ data và hành vi của đối tượng. Được thể hiện qua từ khóa
- public
- private
- protected

Nếu một thuộc tính là private, muốn lấy hoặc thay đổi giá trị phải thông qua 2 phương thức điển hình là getter và setter

## Inheritance

Là một cơ chế mà một lớp thừa hưởng những thứ đã có của lớp trước, ví dụ con cái thừa hưởng gen từ cha mẹ. Với inheritance, chúng ta có thể tái sử dụng thuộc tính và phương thức
class car kế thừa class vehicle, sẽ thừa hưởng phương thức run()

## Polymorphism

Sử dụng tham chiếu đến một lớp cha để ảnh hưởng đến lớp con, một class có nhiều dạng, bằng cách một class được kế thừa bởi nhiều class khác

ví dụ, class Bike, class Car, kế thừa từ class vehicle. Khi đó một vehicle có 2 dạng

bike.run() sẽ khác car.run()
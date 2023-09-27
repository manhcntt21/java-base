Equal là ràng buộc cái đối tượng CÙNG KIỂU với các thuộc tính có giá trị giống nhau thì trả về true
    https://www.baeldung.com/java-equals-hashcode-contracts

Hashcode trả về một mã băm (số nguyên) đại diện cho một đối tượng trên bộ nhớ, có thể khi khởi động lại máy hoặc chạy 
ứng dụng trên máy khác sẽ khác nhau nhưng nếu trong cùng 1 phiên sẽ có cùng giá trị

  - Nếu 2 object bằng nhau (equals = true) thì hashcode bằng nhau

  - Nếu 2 object khác nhau (equals = false) thì không có rằng buộc gì về mã băm, có thể giống hoặc khác nhau, 
tuy nhiên việc tạo ra mã băm khác nhau sẽ cải thiện hiệu suất

  - Nếu 2 object có hashcode giống nhau, không có rằng buộc nào về sự equal của chúng (chúng có thể bằng nhau hoặc không)
    
  - Nếu 2 object có hashcode khác nhau, chúng không được bằng nhau (equals = false)

Mối quan hệ giữa equal và hashcode

  - khi phương thức equals được ghi đè, hashcode cũng phải được ghi đè
 
Thông tin đặc biệt:

  - Equals là một phương thức vì vậy, khi so sánh với null:  null.equals(othervalue) sẽ báo lỗi NullPointerException, 
chúng ta dùng == operator, chứ không dùng equals: https://stackoverflow.com/questions/4501061/java-null-check-why-use-instead-of-equals
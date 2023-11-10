*Generic methods* là những methods có khả năng làm việc với các kiểu dữ liệu khác nhau mà không cần phải định nghĩa lại.

Ví dụ:
- static và non-static method
- constructor

Cú pháp như sau: 
```java
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
        }
```
[access modifier] + [static/non-static] + type + kiểu trả về của method + tên method + tham số của method

Sau đó sử dụng:
```java
Pair<Integer, String> p1 = new Pair<>(1, "apple");
Pair<Integer, String> p2 = new Pair<>(2, "pear");
boolean same = Util.<Integer, String>compare(p1, p2);
```
hoặc

```java
Pair<Integer, String> p1 = new Pair<>(1, "apple");
Pair<Integer, String> p2 = new Pair<>(2, "pear");
boolean same = Util.compare(p1, p2);
```

Việc bỏ kiểu ở `compare` được gọi là `inference`
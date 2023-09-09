# String - 문자열
- 순서를 가진 문자들의 집합
  - "쌍따옴표" 를 통해 나타 냄
  - 글자, 단어, 문장 등 문자로 구성된 자료형
<br><br>
- Java.lang 패키지로 제공됨
- import 없이 사용 가능
<br><br>
- 한 번 인스턴스가 생성되면 수정할 수 없음 (immutable object)
```
char[] char_arr = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
char_arr[4] = 'E';
System.out.println(char_arr);
// ABCDEFG

String str = "ABCDEFG";
str[4] = 'E';
System.out.println(str);
// Compile Error!
```
<br>

- 값의 변경은 불가능 하지만, 새 String을 만들어 바꿀 수 있다.
```
String str_literal1 = "test";
String str_literal2 = "test";
Stirng str_object1 = new String("test");
String str_object2 = new String("test");

str_literal1 == str_literal2  // true
str_literal1 == str_object1   // false
str_object1 == str_object2    // false

str_literal1.equals(str_literal2) // true
str_literal1.equals(str_object1)  // true
str_object1.equals(str_object2)   // true
```
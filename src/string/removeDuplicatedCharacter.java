package string;

import java.util.Scanner;

/**
 * Q. 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
 *    (중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.)
 */
public class removeDuplicatedCharacter {
    public static String removeDuplicatedCharacter(String text) {
        String answer = "";
        for (int i = 0; i< text.length(); i++) {
            // indexOf 는 해당 문자가 여러개 있어도 가장 첫번째 위치를 표시함
            // 해당 문자의 index 번호와 indexOf 로 검색한 index 번호가 다르면, 그 문자는 중복 문자임
            // System.out.println(text.charAt(i) + " " + i + " " + text.indexOf(text.charAt(i)));
            if ( text.indexOf(text.charAt(i)) == i ) answer += text.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();   // ksekkset
        System.out.println("result: " + removeDuplicatedCharacter(text));
    }
}

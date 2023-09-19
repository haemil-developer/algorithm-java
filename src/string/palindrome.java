package string;

import java.util.Scanner;

/**
 * Q. 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
 *    (단, 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.)
 */
public class palindrome {
    public static boolean palindrome_ver1(String word) {
        String origin = word.toUpperCase().replaceAll("[^A-Z]", "");
        String reversed = new StringBuilder(origin).reverse().toString();
        return origin.equals(reversed);
    }

    public static boolean palindrome_ver2(String word) {
        word = word.toUpperCase();
        int length = word.length();
        for(int i = 0; i < length/2; i++) {
            if ( word.charAt(i) != word.charAt(length - i -1)) {    // 왼쪽기준 뒤로 전진, 오른쪽 기준 앞으로 전진
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();   // found7, time: study; Yduts; emit, 7Dnuof
        System.out.println("result: " + palindrome_ver1(word));
    }
}

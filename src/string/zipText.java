package string;

import java.util.Scanner;

/**
 * Q. 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
 *    (단 반복횟수가 1인 경우 생략합니다.)
 */
public class zipText {
    public static String zipText(String text) {
        String answer = "";

        text += " ";
        int counter = 1;
        for(int i = 0; i < text.length()-1; i++) {
            if ( text.charAt(i) == text.charAt(i+1) ) {
                counter++;
            } else {
                answer += String.valueOf(text.charAt(i));
                if (counter > 1 ) answer += String.valueOf(counter);
                counter = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();   // KKHSSSSSSSE, KSTTTSEEKFKKKDJJGG
        System.out.println("result: " + zipText(text)); // K2HS7E, KST3SE2KFK3DJ2G2
    }
}

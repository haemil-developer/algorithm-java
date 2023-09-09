package string;

import java.util.Scanner;

/**
 Q. 알파벳으로만 이루어진 문자열이 주어질 때 소문자는 대문자로, 대문자는 소문자로 변경한 문자열을 출력하시오.

 1. 문자가 주어졌을 때, 소문자/대문자를 어떻게 판별할 수 있을까?
 2. 소문자(대문자)가 주어졌을 때 대문자(소문자)로 어떻게 바꿀 수 있을까?
 **/
public class switchCases {

    private static String switchCases_v1(String str) {
        char[] charArray = new char[str.length()];

        int index = 0;
        for (char character : str.toCharArray() ) {
            char switchedCharacter;
            if (character> 64 &&character < 91 ) {  // upper case
                switchedCharacter = (char) ((int) character + 32);
            } else if (character> 96 &&character < 123 ) {    // lower case
                switchedCharacter = (char) ((int) character - 32);
            } else {
                switchedCharacter = character;
            }
            charArray[index] = switchedCharacter;
            index++;
        }

        return String.valueOf(charArray);
    }

    private static String switchCases_v2(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ('A' <= ch && ch <= 'Z') {
                result += (char) ('a' + ch - 'A');
            } else if ('a' <= ch && ch <= 'z') {
                result += (char) ('A' + ch - 'a');
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // WrongAnswer
        String str = scanner.next();
        System.out.println("result v1: " + switchCases_v1(str));
        System.out.println("result v2: " + switchCases_v2(str));
    }
}

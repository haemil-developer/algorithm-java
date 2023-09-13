package string;

import java.util.Scanner;

/**
 * Q. 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
 *  (대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.)
 */
public class searchCharacter {

    public static int searchCharacter_ver1(String word, Character character) {
        char[] charArray = word.toLowerCase().toCharArray();
        character = Character.toLowerCase(character);

        int count = 0;
        for (char _char : charArray) {
            if (_char == character) count++;
        }
        return count;
    }

    public static int searchCharacter_ver2(String word, Character character) {
        word = word.toLowerCase();
        character = Character.toLowerCase(character);

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if ( word.charAt(i) == character ) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();       // Computercooler
        Character character = scanner.next().charAt(0);  // c
        System.out.println("result: " + searchCharacter_ver1(word, character));
    }
}

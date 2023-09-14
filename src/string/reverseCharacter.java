package string;

import java.util.Scanner;

/**
 * Q. 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고, 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 *
 * ver1, ver2 는 같은 로직 다른풀이가 아닌,
 * 문제를 어떻게 해석하느냐에 따라 다른 결과가 나올수있는 경우를 각각 작성함.
 */
public class reverseCharacter {
    public static String reverseCharacter_ver1(String word) {
        char[] charArray = word.toCharArray();
        int leftPoint = 0, rightPoint = word.length() - 1;

        while(leftPoint < rightPoint) {
           if ( Character.isAlphabetic(charArray[leftPoint]) && Character.isAlphabetic(charArray[rightPoint]) ) {
               char temp = charArray[leftPoint];
               charArray[leftPoint] = charArray[rightPoint];
               charArray[rightPoint] = temp;
           }
           leftPoint++;
           rightPoint--;
        }
        return String.valueOf(charArray);
    }

    public static String reverseCharacter_ver2(String word) {
        char[] charArray = word.toCharArray();
        int leftPoint = 0, rightPoint = word.length() - 1;

        while(leftPoint < rightPoint) {
            if ( !Character.isAlphabetic(charArray[leftPoint]) ) leftPoint++;
            else if ( !Character.isAlphabetic(charArray[rightPoint]) ) rightPoint--;
            else {
                char temp = charArray[leftPoint];
                charArray[leftPoint] = charArray[rightPoint];
                charArray[rightPoint] = temp;
                leftPoint++;
                rightPoint--;
            }
        }
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();    // a#b!GE*T@S
        System.out.println("result: " + reverseCharacter_ver2(word));
    }
}

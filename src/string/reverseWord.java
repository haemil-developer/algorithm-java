package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Q. N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 *    - 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
 *    - 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
 */
public class reverseWord {
    public static List<String> reverseWord_ver1(List<String> words) {
        List<String> result = new ArrayList<>();
        for(String word : words) {
            result.add(new StringBuilder(word).reverse().toString());
        }
        return result;
    }

    public static List<String> reverseWord_ver2(List<String> words) {
        List<String> result = new ArrayList<>();
        for(String word : words) {
            char[] charArray = word.toCharArray();
            int leftPoint = 0, rightPoint = word.length() - 1;

            while(leftPoint < rightPoint) {
                char temp = charArray[leftPoint];
                charArray[leftPoint] = charArray[rightPoint];
                charArray[rightPoint] = temp;
                leftPoint++;
                rightPoint--;
            }
            result.add(String.valueOf(charArray));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        List<String> words = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            words.add(scanner.next());
        }

        System.out.println("result =>");
        for (String result : reverseWord_ver1(words) ) {
            System.out.println(result);
        }
    }
}

package string;

import java.util.Scanner;

/**
 * Q. 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 *    - 문장 속의 각 단어는 공백으로 구분된다.
 *    - 가장 길이가 긴 다어가 여러개일 경우 문장 속에서 가장 앞쪽에 위치한 단어를 답으로 한다.
 */
public class searchWord {

    public static String searchWord_ver1(String sentence) {
        String[] words = sentence.split(" ");
        String answer = words[0];
        for(String word : words) {
            if(word.length() > answer.length()) answer = word;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();    // it is time to study
        System.out.println("result: " + searchWord_ver1(sentence));
    }
}

package string;

import java.util.Scanner;

/**
 * Q. 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하세요
 */
public class distanceCharacter {
    public static int[] distanceCharacter(String word, Character character) {
        int[] answer  = new int[word.length()];

        int pointer = word.length();
        // 왼쪽 -> 오른쪽 기준으로 순회
        for(int i = 0; i < word.length(); i++) {
            if( word.charAt(i) == character ){
                pointer = 0;
            } else {
                pointer++;
            }
            answer[i] = pointer;
        }

        // 왼쪽 <- 오른쪽 기준으로 순회
        pointer = word.length();
        for(int i = word.length()-1; i >= 0; i--) {
            if( word.charAt(i) == character ){
                pointer = 0;
            } else {
                pointer++;
                answer[i] = Math.min(answer[i], pointer);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();   // teachermode
        Character character = scanner.next().charAt(0); // e

        System.out.print("result: ");
        int[] results = distanceCharacter(word, character);
        for(int i : results) {
            System.out.print(i + " ");
        }
    }
}

package string;

import java.util.Scanner;

/**
 Q. 두 단어를 애너그램으로 만들기 위해 제거해야하는 문자의 최소 개수
    애너그램: 단어의 구성(알파벳과 그 개수)이 완전히 같은 단어
 **/
public class anagram {
    private static int anagram(String str_a, String str_b) {
        /*
        int[] countA = new int[26];
        int[] countB = new int[26];
        for (int i = 0; i < str_a.length(); i++ ) countA[str_a.charAt(i) - 'a']++;
        for (int i = 0; i < str_b.length(); i++ ) countB[str_b.charAt(i) - 'a']++;
        */

        int[] countA = getAlphabetCount(str_a);
        int[] countB = getAlphabetCount(str_b);

        int answer = 0;
        for (int i = 0; i < 26; i++) {
            /*
            if (countA[i] > countB[i]) {
                answer += countA[i] - countB[i];
            } else if (countB[i] > countA[i]) {
                answer += countB[i] - countA[i];
            }
            */
            answer += Math.abs(countA[i] - countB[i]);  // Math.abs() 절댓값
        }
        return answer;
    }

    private static int[] getAlphabetCount(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++ ) count[str.charAt(i) - 'a']++;
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str_a = scanner.next();  // aabbcc
        String str_b = scanner.next();  // xxyybb
        System.out.println("result: " + anagram(str_a, str_b));
    }
}

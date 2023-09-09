package string;

import java.util.Scanner;

/**
 Q. 문자열에서 가장 많이 등장한 알파벳 (대소문자 구분하지 않음)을 대문자로 출력한다.
    단, 가장 많이 사용된 알파벳이 여러개 존재하는 경우에는 ?를 출력한다.

 1. 각 알파벳의 개수를 구한다.
 2. 그 중 최댓 값을 구한다.
 **/
public class countMaxCharacter {

    private static Character countMaxCharacter_ver1(String str) {
        str = str.toLowerCase();

        int[] count = getAlphabetCount_ver1(str);

        int maxCount = -1;
        char maxAlphabet = '?';
        for(int i = 0; i < 26; i++) {
           if ( count[i] > maxCount ) {
               maxCount = count[i];
               maxAlphabet = (char)('A' + i);
           } else if (count[i] == maxCount) {
               maxAlphabet = '?';
           }
        }

        return maxAlphabet;
    }

    private static int[] getAlphabetCount_ver1(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++ ) count[str.charAt(i) - 'a']++;
        return count;
    }

    private static Character countMaxCharacter_ver2(String str) {
        str = str.toUpperCase();

        int maxCount = -1;
        char maxAlphabet = '?';
        for(char alp = 'A'; alp < 'Z'; alp++) {
            int count = getAlphabetCount_ver2(str, alp);
            if ( count > maxCount ) {
                maxCount = count;
                maxAlphabet = alp;
            } else if (count == maxCount) {
                maxAlphabet = '?';
            }
        }

        return maxAlphabet;
    }

    private static int getAlphabetCount_ver2(String str, char alp) {
        int count = 0;
        for (int i = 0; i < str.length(); i++ ){
            if (alp == str.charAt(i)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();  // Mississipi
        System.out.println("result ver1: " + countMaxCharacter_ver1(str));
        System.out.println("result ver2: " + countMaxCharacter_ver2(str));
    }
}

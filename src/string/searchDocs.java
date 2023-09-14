package string;

import java.util.Scanner;

/**
 * Q. 주어진 단어가 문서에 등장하는 횟수, 길이는 최대 50, 문서와 단어는 알파벳소문자와 공백으로 이루어져있다.
 *
 * 1. 문서의 첫 글자부터 순회한다.
 * 2. 문서의 지금 글자부터 주어진 단어와 한글자씩 비교한다.
 * 3-1. 단어와 완전히 일치하면 개수를 올린다.
 *      해당 단어가 등장한 이후버터 2를 반복한다.
 * 3-2. 단어와 매치되지 않았다면 다음 글자에서 2를 반복한다.
 */
public class searchDocs {
    public static int searchDocs_ver1(String doc, String word) {
        int count = 0;
        int startIndex = 0;
        while (true) {
            int findIndex = doc.indexOf(word, startIndex);
            if (findIndex < 0) {    // not found
                break;
            } else {
                count++;
                startIndex = findIndex + word.length();
            }
        }
        return count;
    }
    
    public static int searchDocs_ver2(String doc, String word) {
        String replaced = doc.replace(word, "");
        int leftLength = doc.length() - replaced.length();
        int count = leftLength / word.length(); // leftLength 에서 word 의 배수만큼 사라졌기때문에, 자연수의 몫만 나오게된다.
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String doc = scanner.nextLine();    // aaaaaaa
        String word = scanner.nextLine();   // aa
        System.out.println("result: " + searchDocs_ver1(doc, word));
    }
}

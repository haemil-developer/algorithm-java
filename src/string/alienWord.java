package string;

import java.util.Scanner;

/**
 * 1. “#*****#”를 일곱자리의 이진수로 바꿉니다. (#은 이진수의 1로, *이진수의 0으로 변환) => “1000001”
 * 2. 바뀐 2진수(“1000001”)를 10진수화 합니다. => "65"
 * 3. 아스키 번호가 65문자로 변환합니다. => 'A'
 *
 * e.g)
 * input: #****###**#####**#####**##**
 * #****## --> 'C'
 * #**#### --> 'O'
 * #**#### --> 'O'
 * #**##** --> 'L'
 *
 * result: COOL
 */
public class alienWord {
    public static String alienWord(int length, String word) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < length; i++) {
            String binaryNumber = word.substring(0, 7).replace('#', '1').replace('*', '0');
            int decimalNumber = Integer.parseUnsignedInt(binaryNumber, 2);
            answer.append((char) decimalNumber);
            word = word.substring(7);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer length = scanner.nextInt(); // 4
        String text = scanner.next();       // #****###**#####**#####**##**
        System.out.println("result: " + alienWord(length, text)); // COOL
    }
}

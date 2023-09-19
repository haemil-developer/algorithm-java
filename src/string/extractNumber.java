package string;

import java.util.Scanner;

public class extractNumber {
    public static int extractNumber_ver1(String text) {
        String numberString = text.replaceAll("[^0-9]", "");
        return Integer.parseInt(numberString);
    }

    public static int extractNumber_ver2(String text) {
        int result = 0;
        for (char c : text.toCharArray()) {
            // ASCII character number '0' ~ '9'
            if ( c >= 48 && c <= 57) result = result * 10 + (c - 48);
        }
        return result;
    }

    public static int extractNumber_ver3(String text) {
        String result = "";
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) result += c;
        }
        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();   // g0en2T0s8eSoft
        System.out.println("result: " + extractNumber_ver1(text));
    }
}

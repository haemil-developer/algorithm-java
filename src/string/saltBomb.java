package string;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Q. 첫째 줄에는 현재 시작이 hh:mm:ss로 주어진다. 시간의 경우 0<=h<=23이며, 분과 초는 각각 0<=m<=59이다.
 *    로봇팔이 소금을 투하할때까지 필요한 시간을 hh:mm:ss로 출력한다.
 *    이때 시간은 1초보다 크거나 같고, 24시간보다 작거나 같다. (-> 현재시간과 투하시간이 같을때 00:00:00 이 되면 안된다.)
 *
 * HH:MM:SS 포맷의 두 시각의 차이를 HH:MM:SS 포맷으로 출력하기
 * 1. ':' 문자를 기준으로 시간, 분, 초를 쪼갠다.
 * 2. 두 시간 분, 초의 차이를 계산한다.
 * 3. 구해진 시간을 HH:MM:SS 형태로 출력한다.
 */
public class saltBomb {
    public static String saltBomb (String current, String drop) {
        String[] currentUnit = current.split(":");
        int currentHour = Integer.parseInt(currentUnit[0]);
        int currentMinute = Integer.parseInt(currentUnit[1]);
        int currentSecond = Integer.parseInt(currentUnit[2]);
        int currentSecondAmount = currentHour * 3600 + currentMinute * 60 + currentSecond;

        System.out.println("getTime_ver1:");
        getTime_ver1(current);
        System.out.println("getTime_ver2:");
        getTime_ver2(current);
        System.out.println("getTime_ver3:");
        getTime_ver3(current);

        String[] dropUnit = drop.split(":");
        int dropHour = Integer.parseInt(dropUnit[0]);
        int dropMinute = Integer.parseInt(dropUnit[1]);
        int dropSecond = Integer.parseInt(dropUnit[2]);
        int dropSecondAmount = dropHour * 3600 + dropMinute * 60 + dropSecond;

        System.out.println("calcTime:");
        calcTime(currentHour, currentMinute, currentSecond, dropHour, dropMinute, dropSecond);

        int needSecondAmount = dropSecondAmount - currentSecondAmount;
        if ( needSecondAmount <= 0 ) needSecondAmount += 24 * 3600;

        int needHour = needSecondAmount / 3600;
        int needMinute = (needSecondAmount % 3600) / 60;
        int needSecond = needSecondAmount % 60;

        return String.format("%02d:%02d:%02d", needHour, needMinute, needSecond);
    }

    // 10진수 계산 법: 각 단위의 index에서 10의 자리와 1의 자리를 구해 계산
    private static void getTime_ver1(String time) {
        int hour = (time.charAt(0) - '0') * 10 + time.charAt(1) - '0';
        int minute = (time.charAt(3) - '0') * 10 + time.charAt(4) - '0';
        int second = (time.charAt(6) - '0') * 10 + time.charAt(7) - '0';
        System.out.printf("hour: %d, minute: %d, second: %d%n", hour, minute, second);
    }

    // String.substring 이용
    private static void getTime_ver2(String time) {
        int hour = Integer.parseInt(time.substring(0,2));
        int minute = Integer.parseInt(time.substring(3,5));
        int second = Integer.parseInt(time.substring(6,8));
        System.out.printf("hour: %d, minute: %d, second: %d%n", hour, minute, second);
    }

    private static void getTime_ver3(String time) {
        String[] timeUnit = time.split(":");
        int hour = Integer.parseInt(timeUnit[0]);
        int minute = Integer.parseInt(timeUnit[1]);
        int second = Integer.parseInt(timeUnit[2]);
        System.out.printf("hour: %d, minute: %d, second: %d%n", hour, minute, second);
    }

    private static void calcTime(int currentHour, int currentMinute, int currentSecond, int dropHour, int dropMinute, int dropSecond) {
        int needHour = dropHour - currentHour;
        int needMinute = dropMinute - currentMinute;
        int needSecond = dropSecond - currentSecond;

        // 내림으로 뺄샘하기
        if ( needSecond < 0 ) { // 1분을 60초로 변환해 더해준다.
            needSecond += 60;
            needMinute--;
        }

        if ( needMinute < 0 ) {  // 1시간을 60분으로 변환해 더해준다.
            needMinute += 60;
            needHour--;
        }

        if ( needHour < 0 ) {   // 하루를 24시간으로 변화해 더해준다.
            needHour += 24;
        }

        System.out.printf("needHour: %d, needMinute: %d, needSecond: %d%n", needHour, needMinute, needSecond);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String current = scanner.next();    // 20:00:00, 12:34:56
        String drop = scanner.next();   // 04:00:00, 14:36:22
        System.out.println("result: " + saltBomb(current, drop));
    }
}

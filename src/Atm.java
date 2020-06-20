import java.util.*;

/**
 * 문제 출처 : https://www.acmicpc.net/problem/11399
 */
public class Atm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사람수를 입력 받는다.
        int numberOfPeople = scanner.nextInt();

        // 사람마다 ATM 인출 시간을 입력받는다.
        int[] timePerPeople = new int[numberOfPeople];
        for (int i = 0; i < numberOfPeople; i++) {
            timePerPeople[i] = scanner.nextInt();
        }

        // 배열을 오름차순으로 정렬한다.
        Arrays.sort(timePerPeople);

        // 누적 시간의 합을 구한다
        int sum = 0;
        int totalTime = 0;

        for (int i = 0; i < numberOfPeople; i++) {
            sum += timePerPeople[i];
            totalTime += sum;
        }

        System.out.println(totalTime);
        scanner.close();

    }
}

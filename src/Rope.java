import java.util.Arrays;
import java.util.Scanner;

/**
 * 문제 : https://www.acmicpc.net/problem/2217
 */
public class Rope {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ropeArr = new int[n];

        for (int i = 0; i < n; i++) {
            ropeArr[i] = scanner.nextInt();
        }

        Arrays.sort(ropeArr);

        int max = 0;

        for (int i = n - 1; i >= 0; i--) {
            max = Math.max(max, ropeArr[i] * (n - i));
        }

        System.out.println(max);

        scanner.close();
    }
}

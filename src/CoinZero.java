import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 문제 출처 : https://www.acmicpc.net/problem/11047
 */
public class CoinZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCoins = scanner.nextInt();
        int money = scanner.nextInt();

        Integer[] coinValue = new Integer[numberOfCoins];
        for (int i = 0; i < numberOfCoins; i++) {
            coinValue[i] = scanner.nextInt();
        }

        // 큰 동전의 가치로 나눠야하므로 역순으로 정렬한다
        Arrays.sort(coinValue, Comparator.reverseOrder());

        int sumOfCoins  = 0;

        // 몫을 구하고 나머지를 다시 가치가 낮은 동전으로 나눈다. 그리고 이를 반복한다.
        for(Integer value : coinValue){
            sumOfCoins += money/value;
            money = money%value;
        }

        System.out.println(sumOfCoins);
        scanner.close();
    }
}

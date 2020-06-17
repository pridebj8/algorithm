/**
 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
 * 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
 *
 * 제한사항
 * N의 범위 : 100,000,000 이하의 자연수
 *
 * 입출력 예
 * N	answer
 * 123	6
 * 987	24
 */
public class AddmingDigits2 {

    public static void main(String[] args) {
        int number = 222;
        int answer = solution(number);
        System.out.println(answer);
    }

    public static int solution(int n) {
        int answer = 0;

        // 나머지를 구하고, 몫을 다시 나누어 나머지를 구한다. 이를 반복하여 얻은 나머지의 합을 구한다.
        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}

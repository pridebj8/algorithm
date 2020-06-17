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
public class AddingDigits {

    public static void main(String[] args) {
        int number = 123;
        int answer = solution(number);
        System.out.println(answer);
    }

    public static int solution(int n) {
        int answer = 0;

        String numberString = Integer.toString(n);
        // 숫자를 String으로 변환하여 각 자리의 합을 더한다.
        String[] numberStringArray = numberString.split("");

        for (String digit : numberStringArray) {
            answer += Integer.parseInt(digit);
        }

        return answer;
    }
}

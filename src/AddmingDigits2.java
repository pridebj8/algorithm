public class AddmingDigits2 {

    public static void main(String[] args) {
        int number = 222;
        int answer = solution(number);
        System.out.println(answer);
    }

    public static int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}

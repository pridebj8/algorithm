public class AddingDigits {

    public static void main(String[] args) {
        int number = 123;
        int answer = solution(number);
        System.out.println(answer);
    }

    public static int solution(int n) {
        int answer = 0;

        String numberString = Integer.toString(n);
        String[] numberStringArray = numberString.split("");

        for (String digit : numberStringArray) {
            answer += Integer.parseInt(digit);
        }

        return answer;
    }
}

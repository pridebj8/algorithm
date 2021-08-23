package greedy;

public class 곱하기_혹은_더하기 {

    public static void main(String[] args) {
        String number = "101234";
        int result = solution(number);
        System.out.println("result : " + result);
    }

    private static int solution(String number) {
        int result = number.charAt(0) - '0';

        for (int i = 1; i < number.length(); i++) {
            int num = number.charAt(i) - '0';
            if (num == 0 || num == 1) {
                result += num;
            } else {
                result *= num;
            }
        }

        return result;
    }

}

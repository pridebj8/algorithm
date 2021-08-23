package greedy;

public class 일이_될때까지 {

    public static void main(String[] args) {
        int n = 25;
        int k = 3;
        int count = solution2(n, k);
        System.out.println("answer: " + count);
    }

    private static int solution(int n, int k) {
        int count = 0;

        if (k == 1) count = n - 1;

        while (n != 1) {
            if (n % k == 0) {
                n /= k;
                count++;
            } else {
                n--;
                count++;
            }
        }
        return count;
    }

    private static int solution2(int n, int k) {
        int count = 0;

        while (true) {
            int target = (n / k) * k;
            count += (n - target);
            n = target;

            if (n < k) break;

            count += 1;
            n /= k;
        }
        count += (n - 1);
        return count;
    }

}

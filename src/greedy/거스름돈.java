package greedy;

public class 거스름돈 {

    public static void main(String[] args) {
        int n = 1260;
        int[] coinType = {500, 100, 50, 10};
        int count = solution(n, coinType);
        System.out.println("answer: " + count);
    }

    private static int solution(int n, int[] coinType) {
        int count = 0;

        for (int coin : coinType) {
            if (n == 0) break;
            count += Math.floorDiv(n, coin);
            n = Math.floorMod(n, coin);
/*
            answer += n / coin;
            n %= coin;
*/
        }
        return count;
    }

}

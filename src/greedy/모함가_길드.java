package greedy;

import java.util.Arrays;

public class 모함가_길드 {

    public static void main(String[] args) {
        int n = 5;
        int[] adventurer = new int[] {2, 3, 1, 2, 2};
        int result = solution(n, adventurer);
        System.out.println("result : " + result);
    }

    private static int solution(int n, int[] adventurer) {
        int result = 0;

        Arrays.sort(adventurer);

        int count = 0;
        for (int i = 0; i < adventurer.length; i++) {
            count += 1;
            if (count >= adventurer[i]) {
                result++;
                count = 0;
            }
        }
        return result;
    }

}

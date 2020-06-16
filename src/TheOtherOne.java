import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TheOtherOne {

    public static void main(String[] args) {
        int[][] v= {{1,2},{2,2},{2,1}};
        int [] answer = solution(v);
        System.out.println("answer : " + Arrays.toString(answer));
    }

    public static int[] solution(int[][] v) {
        int[] answer = new int[2];

        Map<Integer, Integer> xMap = new HashMap<>();
        Map<Integer, Integer> yMap = new HashMap<>();

        for (int[] point : v) {
            int x = point[0];
            int y = point[1];

            if (!xMap.containsKey(x)) {
                xMap.put(x, 1);
            } else {
                xMap.put(x, 2);
            }

            if (!yMap.containsKey(y)) {
                yMap.put(y, 1);
            } else {
                yMap.put(y, 2);
            }
        }

        for (int x : xMap.keySet()) {
            if (xMap.get(x) == 1 ){
                answer[0] = x;
            }
        }

        for (int y : yMap.keySet()) {
            if (yMap.get(y) == 1) {
                answer[1] = y;
            }
        }

        return answer;
    }
}

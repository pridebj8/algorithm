import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 특정한 합을 가지는 부분 연속 수열 찾기
 * 문제 : [1,2,3,2,5]로 구성된 수열이 있다. 합이 5인 부분 연속 수열의 개수를 구해보시오.
 * 정답 : 5 ([2.3], [3,2], [5])
 */
public class TwoPointerExample {

    public static void main(String[] args) {
        int[] s = {1,1,1,1,1};
        int answer = solution(s);
        System.out.println("3 : " + answer);

    }

    public static int solution(int[] s) {
        int result = 0;
        List<Integer> list = Arrays.stream(s).boxed().collect(Collectors.toList());

        int n = 5; // 수열 사이즈, 데이터 갯수
        int m = 5; // 합 (5)
        int sum = 0; // start부터 end까지의 합
        int end = 0;

        for (Integer start : list) {
            while (sum < m && end < n) {
                sum += list.get(end);
                end += 1;
            }
            // 합이 5이면 카운트를 증가시킨다
            if (sum == m) {
                result += 1;
            }
            sum -= start;
        }

        return result;
    }
}

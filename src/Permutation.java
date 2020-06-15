import java.util.HashSet;
import java.util.Set;

public class Permutation {

    public static void main(String[] args) {
        int[] arr = {4, 1, 1, 3, 2, 2};
        boolean isOk = solution(arr);
        System.out.println(isOk);
    }

    public static boolean solution(int[] arr) {
        boolean answer = true;

        Set<Integer> set = new HashSet<>();

        for (int value : arr) {
            if (value <= arr.length && !set.contains(value)) {
                set.add(value);
            } else {
                return false;
            }
        }

        if (arr.length != set.size()) {
            answer = false;
        }

        return answer;
    }
}

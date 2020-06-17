import java.util.HashSet;
import java.util.Set;

/**
 * 길이가 n인 배열에 1부터 n까지 숫자가 중복 없이 한 번씩 들어 있는지를 확인하려고 합니다.
 * 1부터 n까지 숫자가 중복 없이 한 번씩 들어 있는 경우 true를, 아닌 경우 false를 반환하도록 함수 solution을 완성해주세요.
 *
 * 제한사항
 * 배열의 길이는 10만 이하입니다.
 * 배열의 원소는 0 이상 10만 이하인 정수입니다.
 *
 * 입출력 예
 * arr	        result
 * [4, 1, 3, 2]	true
 * [4, 1, 3]	false
 */
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

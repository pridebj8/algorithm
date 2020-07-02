import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/**
 * 문제 : 위장
 * https://programmers.co.kr/learn/courses/30/lessons/42578
 */
public class Camouflage {

    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println("answer : " + solution(clothes));

    }

    public static int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }

        for (String key : map.keySet()) {
            // (옷 종류별 합계+1) * (옷 종류별 합계+1) * (옷 종류별 합계+1)...
            answer *= map.get(key) + 1;
        }
        // 아무것도 안입는 경우를 제외
        answer -= 1;

        return answer;

        // 다른 풀이
        /*
        return Arrays.stream(clothes)
                .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
                .values()
                .stream()
                .collect(reducing(1L, (x, y) -> x * (y + 1))).intValue() - 1;
        */
    }

}

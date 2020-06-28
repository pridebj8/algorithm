import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 문제 : K번째 수
 * https://programmers.co.kr/learn/courses/30/lessons/42748
 */
public class NumberK {

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println("answer : " + Arrays.toString(solution(array, commands)));
    }


    public static int[] solution(int[] array, int[][] commands) {
        List<Integer> list = new ArrayList<>();
        List<Integer> answerList = new ArrayList<>();

        for (int i : array) {
            list.add(i);
        }

        for (int i = 0; i < commands.length; i++) {
            List<Integer> tempList = new ArrayList<>();
            tempList.addAll( list.subList(commands[i][0] - 1, commands[i][1]));
            Collections.sort(tempList);
            answerList.add(tempList.get(commands[i][2] - 1));

        }
        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}

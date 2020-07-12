import java.util.ArrayList;
import java.util.List;

/**
 * 문제 : 모의고사 (완전탐색
 * https://programmers.co.kr/learn/courses/30/lessons/42840
 */
public class MockExam {

    private static List<Integer> supoja1 = null;
    private static List<Integer> supoja2 = null;
    private static List<Integer> supoja3 = null;
    private static int mockExamQuestionCount = 10000;

    public static void main(String[] args) {
        supoja1 = new ArrayList<>();
        supoja2 = new ArrayList<>();
        supoja3 = new ArrayList<>();

        do {
            supoja1.add(1);
            supoja1.add(2);
            supoja1.add(3);
            supoja1.add(4);
            supoja1.add(5);
        } while (supoja1.size() < 10000);

        do {
            supoja1.add(2);
            supoja1.add(1);
            supoja1.add(2);
            supoja1.add(3);
            supoja1.add(2);
            supoja1.add(4);
            supoja1.add(2);
            supoja1.add(5);
        } while (supoja1.size() < 10000);

        do {
            supoja3.add(3);
            supoja3.add(3);
            supoja3.add(1);
            supoja3.add(1);
            supoja3.add(2);
            supoja3.add(2);
            supoja3.add(4);
            supoja3.add(4);
            supoja3.add(5);
            supoja3.add(5);
        } while (supoja3.size() < 10000);

        int[] answers = {1, 2, 3, 4, 5};
        solution(answers);
    }

    public static int[] solution(int[] answers) {
        int[] answer = {};

        return answer;
    }
}

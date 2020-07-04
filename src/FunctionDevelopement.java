import java.util.*;

/**
 * 문제 : 기능 개발
 * https://programmers.co.kr/learn/courses/30/lessons/42586
 */

public class FunctionDevelopement {

    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] answer = solution(progresses, speeds);
        System.out.println("answer : " + Arrays.toString(answer));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();

        // 기능 개발이 끝나는 시점을 계산한다. '100-(현재 진행률)/속도'를 구한 뒤 올림.
        for (int i = 0; i < progresses.length; i++) {
            double a = (double) (100 - progresses[i]) / speeds[i];
            int deployDay = (int) Math.ceil(a);
            queue.add(deployDay);
        }

        int standard = 0;
        if (!queue.isEmpty()) {
            standard = queue.poll();
        }
        int count = 1;

        //맨 앞에서 하나씩 빼서 다음 값이 작으면 카운트롤 올리고 크면 배포 리스트에 넣는다.
        while (!queue.isEmpty()) {
            int next = queue.poll();

            if (standard >= next) {
                count += 1;
            } else {
                answerList.add(count);
                count = 1;
                standard = next;
            }
        }
        answerList.add(count);

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}

import java.util.Arrays;

/**
 * 문제 : 구명보트 (탐욕 알고리즘)
 * https://programmers.co.kr/learn/courses/30/lessons/42885
 */
public class Lifeboat {

    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
//        int[] people = {70, 80, 50};
        int limit = 100;
        System.out.println("answer : " + solution(people, limit));
    }

    public static int solution(int[] people, int limit) {
        Arrays.sort(people);

        int answer = 0;
        int index = people.length - 1;
        for (int i = 0; i <= index; i++, answer++)
            while (index > i && people[i] + people[index--] > limit)
                answer++;

        return answer;
    }
}

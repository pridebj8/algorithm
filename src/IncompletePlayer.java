import java.util.*;

/**
 * 문제 : 완주하지 못한 선수
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 */
public class IncompletePlayer {

    public static void main(String[] args) {
        String[] participant = {"a", "b", "ccc"};
        String[] completion = {"b", "a"};
        System.out.println(solution(participant, completion));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> participantMap = new HashMap<>();

        for (String p : participant) {
            if (participantMap.containsKey(p)) {
                participantMap.put(p, participantMap.get(p) + 1);
            } else {
                participantMap.put(p, 1);
            }
        }

        for (String c : completion) {
            if (participantMap.containsKey(c)) {
                participantMap.put(c, participantMap.get(c) - 1);
            }
        }

        for (String key : participantMap.keySet()) {
            if (participantMap.get(key) > 0) {
                answer = key;
            }
        }

        return answer;
    }

}

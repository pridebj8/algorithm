import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * 문제 : 완주하지 못한 선수
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 */
public class ImcompletedPlayer {

    public static void main(String[] args) {
        String[] participant = {"a", "b","ccc"};
        String[] completion = {"b","a"};
        System.out.println(solution(participant, completion));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Set<String> completionSet = new HashSet<>();

        Collections.addAll(completionSet, completion);

        for(var participantPlayer : participant) {
            if (!completionSet.contains(participantPlayer)) {
                answer = participantPlayer;
                break;
            }
        }

        return answer;
    }

}

import java.util.HashSet;

/**
 * 문제 : 체육봅
 * https://programmers.co.kr/learn/courses/30/lessons/42862
 */
public class GymSuit {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};

        System.out.println("answer : " + solution(n, lost, reserve));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n;

        HashSet<Integer> reserveSet = new HashSet<>();
        HashSet<Integer> lostSet = new HashSet<>();

        // 여분 체육복이 있는 학생을 Set에 넣어준다
        for (int i : reserve) {
            reserveSet.add(i);
        }

        // 체육복 도난 학생을 Set에 넣어준다
        for (int i : lost) {
            // 여유 체육복이 있는 학생이 도난 당했을 경우 제거한다
            if (reserveSet.contains(i)) {
                reserveSet.remove(i);
            } else {
                lostSet.add(i);
            }
        }

        // 도난 학생은 앞뒤의 여분 체육복이 있는 학생에게 체육복을 빌릴 수 있다
        for (int i : lostSet) {
            if (reserveSet.contains(i - 1)) {
                reserveSet.remove(i - 1);
            } else if (reserveSet.contains(i + 1)) {
                reserveSet.remove(i + 1);
            } else {
                // 총 학생 수에서 빼준다
                answer--;
            }
        }
        return answer;
    }

}
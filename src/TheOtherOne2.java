import java.util.Arrays;

/**
 * 직사각형을 만드는 데 필요한 4개의 점 중 3개의 좌표가 주어질 때, 나머지 한 점의 좌표를 구하려고 합니다.
 * 점 3개의 좌표가 들어있는 배열 v가 매개변수로 주어질 때,
 * 직사각형을 만드는 데 필요한 나머지 한 점의 좌표를 return 하도록 solution 함수를 완성해주세요.
 * 단, 직사각형의 각 변은 x축, y축에 평행하며, 반드시 직사각형을 만들 수 있는 경우만 입력으로 주어집니다.
 *
 * 제한사항
 * v는 세 점의 좌표가 들어있는 2차원 배열입니다.
 * v의 각 원소는 점의 좌표를 나타내며, 좌표는 [x축 좌표, y축 좌표] 순으로 주어집니다.
 * 좌표값은 1 이상 10억 이하의 자연수입니다.
 * 직사각형을 만드는 데 필요한 나머지 한 점의 좌표를 [x축 좌표, y축 좌표] 순으로 담아 return 해주세요.
 *
 * 입출력 예
 * v	                        result
 * [[1, 4], [3, 4], [3, 10]]	[1, 10]
 * [[1, 1], [2, 2], [1, 2]]	    [2, 1]
 */
public class TheOtherOne2 {

    public static void main(String[] args) {
        int[][] v= {{1,2},{2,2},{2,1}};
        int [] answer = solution(v);
        System.out.println("answer : " + Arrays.toString(answer));
    }

    public static int[] solution(int[][] v){
        int[] answer = new int[2];
        // XOR를 이요하여 푼다.
        answer[0] = v[0][0] ^ v[1][0] ^v[2][0];
        answer[1] = v[0][1] ^ v[1][1] ^v[2][1];

        return answer;
    }
}

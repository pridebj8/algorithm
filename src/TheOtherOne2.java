import java.util.Arrays;

public class TheOtherOne2 {

    public static void main(String[] args) {
        int[][] v= {{1,2},{2,2},{2,1}};
        int [] answer = solution(v);
        System.out.println("answer : " + Arrays.toString(answer));
    }

    public static int[] solution(int[][] v){
        int[] answer = new int[2];

        answer[0] = v[0][0] ^ v[1][0] ^v[2][0];
        answer[1] = v[0][1] ^ v[1][1] ^v[2][1];

        return answer;
    }
}

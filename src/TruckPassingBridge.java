import java.util.LinkedList;
import java.util.Queue;

/**
 * 문제 : 다리를 지나는 트럭
 *
 */
public class TruckPassingBridge {
    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weight = {7,4,5,6};

        System.out.println("answer : "+ solution(bridge_length, weight, truck_weight));
    }

    public static int solution(int bridge_length, int weight, int[] truck_weight){
        int answer = 0;

        Queue<Integer> bridge = new LinkedList<>();

        return answer;
    }
}

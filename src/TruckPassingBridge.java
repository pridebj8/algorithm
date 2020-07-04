import java.util.LinkedList;
import java.util.Queue;

/**
 * 문제 : 다리를 지나는 트럭
 * https://programmers.co.kr/learn/courses/30/lessons/42583
 */
public class TruckPassingBridge {
    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};

        System.out.println("answer : " + solution(bridge_length, weight, truck_weights));
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer;

        Queue<Truck> waitingTrucks = new LinkedList<>();
        Queue<Truck> passingTrucks = new LinkedList<>();

        int currentBridgeWeight = 0;

        // 전체 트럭을 대기중인 트럭 큐에 넣는다
        for (int currentTruckWeight : truck_weights) {
            waitingTrucks.add(new Truck(currentTruckWeight, 0));
        }

        //첫 번째 트럭가 다리를 통과한다.
        if(!waitingTrucks.isEmpty()) {
            currentBridgeWeight += waitingTrucks.peek().weight;
            passingTrucks.add(waitingTrucks.poll());
        }

        int time = 0;

        // 다리위의 트럭이 없을 때까지 반복한다.
        while (!passingTrucks.isEmpty()) {
            // 초를 더하고 시작한다
            time++;

            // 트럭위치를 이동 시킨다
            for (Truck truck : passingTrucks) {
                truck.index++;
            }

            // 다리 맨 처음의 트럭의 인덱스(위치)가 다리 길이보다 크면 다리를 빠져나온다
            if (passingTrucks.peek().index > bridge_length) {
                currentBridgeWeight -= passingTrucks.poll().weight;
            }

            // 대기중인 트럭이 있고, 다음 트럭과 현재 다리위의 트럭 무게의 합이 다리 무게보다 작으면 다음 트럭을 다리위로 넣는다
            if (!waitingTrucks.isEmpty() && waitingTrucks.peek().weight + currentBridgeWeight <= weight) {
                currentBridgeWeight += waitingTrucks.peek().weight;
                waitingTrucks.peek().index++;
                passingTrucks.add(waitingTrucks.poll());
            }
        }

        answer = time;

        return answer;
    }

    // 트럭 클래스
    static class Truck {
        int weight;
        int index;

        public Truck(int weight, int index) {
            this.weight = weight;
            this.index = index;
        }
    }
}

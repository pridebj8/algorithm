import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 문제 : 기능 개발
 * https://programmers.co.kr/learn/courses/30/lessons/42586
 */

public class FunctionDevelopement {

    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        System.out.println("answer : {}" + solution(progresses, speeds));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < progresses.length; i++){
            double a = (double) (100-progresses[i])/speeds[i];
            int deployDay = (int) Math.ceil(a);
            list.add(deployDay);
        }

        for(int i = 0; i< list.size(); i++){
            int count = 1;
            if(list.get(i)>list.get(i+1)){
                count++;
            }else{

            }
        }



        return answer;
    }
}

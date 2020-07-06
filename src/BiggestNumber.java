import java.util.*;

/**
 * 문제 : 가장 큰 수
 * https://programmers.co.kr/learn/courses/30/lessons/42746
 */
public class BiggestNumber {
    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9}; // 9 5 34 3 30
        System.out.println("answer : " + solution(numbers));

    }

    public static String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        String[] numberArray = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            numberArray[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(numberArray, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        if(numberArray[0].equals("0")) return "0";

        for(String number : numberArray){
            answer.append(number);
        }
        return answer.toString();
    }
}

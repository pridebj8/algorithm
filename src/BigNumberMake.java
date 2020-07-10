import java.util.*;

/**
 * 문제 : 큰 수 만들기
 * https://programmers.co.kr/learn/courses/30/lessons/42883
 */
public class BigNumberMake {

    public static void main(String[] args) {
        String number = "1924";
        int k = 2;
        System.out.println("answer : " + solution(number, k));
    }

    public static String solution(String number, int k) {
        char[] result = new char[number.length() - k];
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            while (!stack.isEmpty() && stack.peek() < c && k-- > 0) {
                stack.pop();
            }
            stack.push(c);
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = stack.get(i);
        }

        return new String(result);
    }
}

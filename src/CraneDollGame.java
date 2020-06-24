import java.util.Stack;

/**
 * 프로그래머스
 * 문제 : 크레인 인형뽑기 게임
 * URL : https://programmers.co.kr/learn/courses/30/lessons/64061
 */
public class CraneDollGame {

    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(solution(board, moves));
    }

    private static int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        int size = board.length;

        for(int move : moves) {
            move = move - 1;

            for (int i = 0; i < size; i++) {
                if (board[i][move] != 0) {
                    int doll = board[i][move];

                    if (!stack.isEmpty() && stack.peek() == doll) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(doll);
                    }

                    board[i][move] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}

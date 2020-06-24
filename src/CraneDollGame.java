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
            //배열의 시작은 0부터
            move = move - 1;

            for (int i = 0; i < size; i++) {
                // 첫번째 행부터 시작한다
                if (board[i][move] != 0) {
                    int doll = board[i][move];

                    // 스택에 인형이 있고 연속된 인형이면 꺼내고 카운트를 +2, 그렇지 않으면 스택에 넣는다
                    if (!stack.isEmpty() && stack.peek() == doll) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(doll);
                    }

                    //인형을 뽑았으면 0으로 마킹해주고 반복문을 탈출한다
                    board[i][move] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}

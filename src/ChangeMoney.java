/**
 * 그리디(탐욕) 알고리즘
 * 거스름돈 문제
 * 최소한의 화폐 갯수로 거스름돈을 돌려줘야 한다.
 * 화폐의 단위는 500원, 100원, 50원이 있다.
 *
 * 입출력 예제
 * 거스름돈 : 1260원
 * 화폐 갯수 : 6개 (500원x2개, 100원x2개, 50원x1개, 10원x1개)
 */
public class ChangeMoney {

    public static void main(String[] args) {
        int money = 1260;
        System.out.println("answer : " + solution(money));
    }

    public static int solution(int money) {
        int answer = 0;

        //500원 짜리로 교환
        answer += money/500;
        money = money%500;
        //100원 짜리로 교환
        answer += money/100;
        money = money%100;
        //50원 짜리로 교환
        answer += money/50;
        money = money%50;
        //10원 짜리로 교환
        answer += money/10;

        return answer;
    }

}

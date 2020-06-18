import java.util.ArrayList;

/**
 * 문제 : 아래와 같이 N개의 정수로 구성된 수열의 있습니다.
 * M개의 쿼리(Query) 정보가 주어집니다.
 * 각 쿼리는 L과 R로 구성됩니다.
 * [L,R] 구간에 해당되는 데이터들의 합을 모두 구해보세요.
 * [10,20,30,40,50]
 *
 * 입출력 예 : [1,3] 구간의 합은 60이다.
 */
public class PrefixSum {

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int l = 3;
        int r = 4;
        System.out.println("answer : " + solution(arr, r, l));
    }

    public static int solution(int[] arr, int r, int l){
        int prefixSum = 0;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);

        /*
         구간 합을 구한다.
         [10,20,30,40,50]의 구한 합은 [10,30,60,100,150] 이다.
         단, 처음에 0을 더해 [0,10,30,60,100,150] 배열을 만들어 계산한다.
         */

        for(int i : arr){
            prefixSum += i;
            list.add(prefixSum);
        }

        return list.get(r) - list.get(l-1);
    }

}

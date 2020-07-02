import java.util.Arrays;

/**
 * 문제 : 전화번호 목록
 * https://programmers.co.kr/learn/courses/30/lessons/42577
 */
public class PhoneNumberList2 {
    public static void main(String[] args) {
        String[] phoneNumberList = {"119", "97674223", "1195524421"};
//        String[] phoneNumberList = {"123", "456", "789"};
//        String[] phoneNumberList = {"12","123","1235","567","88"};
        System.out.println("answer : " + solution(phoneNumberList));
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length-1; i++) {
            if(phone_book[i].startsWith(phone_book[i+1])){
                return false;
            }
        }
        return answer;
    }
}

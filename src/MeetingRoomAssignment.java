import java.util.Arrays;
import java.util.Scanner;

/**
 * 문제 : https://www.acmicpc.net/problem/1931
 */
public class MeetingRoomAssignment{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfMeeting = scanner.nextInt();
        int[][] meetingTimeArray = new int[numberOfMeeting][2];

        for (int i = 0; i < numberOfMeeting; i++) {
            meetingTimeArray[i][0] = scanner.nextInt();
            meetingTimeArray[i][1] = scanner.nextInt();
        }

        Arrays.sort(meetingTimeArray, (a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);

        int count = 0;
        int marking = -1;

        for (int i = 0; i < numberOfMeeting; i++) {
            if (meetingTimeArray[i][0] >= marking) {
                marking = meetingTimeArray[i][1];
                count++;
            }
        }

        System.out.println(count);
        scanner.close();
    }
}

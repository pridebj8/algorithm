import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 문제 : https://www.acmicpc.net/problem/1931
 */
public class MeetingRoomAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfMeeting = scanner.nextInt();
        int[][] meetingTimeArray;
        meetingTimeArray = new int[numberOfMeeting][2];

        for (int i = 0; i < numberOfMeeting; i++) {
            meetingTimeArray[i][0] = scanner.nextInt();
            meetingTimeArray[i][1] = scanner.nextInt();
        }

        Arrays.sort(meetingTimeArray, (start, end) -> {
            if (start[1] == end[1]) {
                return Integer.compare(start[0], end[0]);
            }
            return Integer.compare(start[1], end[1]);
        });

        int count = 0;
        int marking = 0;

        for (int i = 0; i < numberOfMeeting; i++) {
            if (meetingTimeArray[i][0] > marking) {
                marking = meetingTimeArray[i][1];
                count++;
            }
        }

        System.out.println(count);
        scanner.close();
    }
}

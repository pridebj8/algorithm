import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        String[] a = {"1", "11", "101"};
        String[] b = {"1", "11", "101"};
        String[] c = {"1", "11", "101"};
        String[] d = {"1", "11", "101"};
        String[] e = {"1", "11", "101"};

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        Arrays.sort(b, (s1, s2) -> s1.compareTo(s2));
        System.out.println(Arrays.toString(b));

        Arrays.sort(c, (s1, s2) -> s2.compareTo(s1));
        System.out.println(Arrays.toString(c));

        Arrays.sort(d, (s1, s2) -> (s1+s2).compareTo(s2+s1));
        System.out.println(Arrays.toString(d));

        Arrays.sort(e, (s1, s2) -> (s2+s1).compareTo(s1+s2));
        System.out.println(Arrays.toString(e));

    }
}

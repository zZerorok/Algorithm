import java.io.*;
import java.util.*;

public class Main {

    private static final List<int[]> RESULT = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());

        for (int i = 0; i < T; i++) {
            isPalindrome(reader.readLine());
        }

        for (int[] result : RESULT) {
            System.out.println(result[0] + " " + result[1]);
        }
    }

    public static void isPalindrome(String value) {
        int count = 1;
        recursion(value, 0, value.length() - 1, count);
    }

    public static void recursion(String value, int start, int end, int count) {
        if (start >= end) {
            RESULT.add(new int[]{1, count});
        } else if (value.charAt(start) != value.charAt(end)) {
            RESULT.add(new int[]{0, count});
        } else {
            recursion(value, start + 1, end - 1, count + 1);
        }
    }
}

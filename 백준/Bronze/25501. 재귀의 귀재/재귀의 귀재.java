import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());

        List<StringBuilder> result = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            int palindromeResult = isPalindrome(reader.readLine());
            result.add(new StringBuilder(palindromeResult + " " + recursionCount));
        }

        for (StringBuilder builder : result) {
            System.out.println(builder);
        }
    }

    public static int recursionCount;

    public static int isPalindrome(String value) {
        recursionCount = 0;
        return recursion(value, 0, value.length() - 1);
    }

    public static int recursion(String value, int start, int end) {
        recursionCount += 1;

        if (start >= end) {
            return 1;
        } else if (value.charAt(start) != value.charAt(end)) {
            return 0;
        } else {
            return recursion(value, start + 1, end - 1);
        }
    }
}

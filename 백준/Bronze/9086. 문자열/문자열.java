import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(reader.readLine());

        List<String> strings = new ArrayList<>();
        for (int i = 0; i < testCase; i++) {
            strings.add(reader.readLine());
        }

        for (String string : strings) {
            System.out.println(getFirstAndLast(string));
        }
    }

    private static String getFirstAndLast(String value) {
        return String.valueOf(value.charAt(0)) + value.charAt(value.length() - 1);
    }
}

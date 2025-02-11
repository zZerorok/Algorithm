import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());

        List<String> serials = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            serials.add(reader.readLine());
        }

        serials.sort((a, b) -> {
            if (a.length() != b.length()) {
                return Integer.compare(a.length(), b.length());
            }

            int sum1 = sum(a);
            int sum2 = sum(b);

            if (sum1 != sum2) {
                return Integer.compare(sum1, sum2);
            }

            return a.compareTo(b);
        });

        serials.forEach(System.out::println);
    }

    private static int sum(String serial) {
        int sum = 0;
        for (char current : serial.toCharArray()) {
            if (Character.isDigit(current)) {
                sum += current - '0';
            }
        }
        return sum;
    }
}

import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] tokens = reader.readLine().split(" ");
        int count = Integer.parseInt(tokens[0]);
        List<Long> numbers = new ArrayList<>();

        for (int i = 1; i < tokens.length; i++) {
            numbers.add(reverseNumber(tokens[i]));
        }

        while (numbers.size() < count) {
            String line = reader.readLine();
            if (line == null || line.isEmpty()) {
                continue;
            }

            String[] inputs = line.split(" ");
            for (String input : inputs) {
                if (numbers.size() == count) {
                    break;
                }
                numbers.add(reverseNumber(input));
            }
        }

        Collections.sort(numbers);

        StringBuilder builder = new StringBuilder();
        for (long num : numbers) {
            builder.append(num).append(System.lineSeparator());
        }

        System.out.print(builder);
    }

    private static long reverseNumber(String input) {
        return Long.parseLong(new StringBuilder(input).reverse().toString());
    }
}

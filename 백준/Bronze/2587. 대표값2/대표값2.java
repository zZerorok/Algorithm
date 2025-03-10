import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter WRITER = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final List<Integer> numbers = new ArrayList<>();
    private static final int COUNT = 5;

    public static void main(String[] args) throws IOException {
        int sum = 0;
        for (int i = 1; i <= COUNT; i++) {
            int number = Integer.parseInt(READER.readLine());
            numbers.add(number);
            sum += number;
        }

        Collections.sort(numbers);

        WRITER.write(String.valueOf(sum / COUNT));
        WRITER.newLine();
        WRITER.write(String.valueOf(numbers.get((COUNT - 1) / 2)));
        WRITER.flush();
        WRITER.close();
        READER.close();
    }
}

import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter WRITER = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final int[] NUMBERS = new int[5];
    private static final int COUNT = 5;

    public static void main(String[] args) throws IOException {
        int sum = 0;
        for (int i = 0; i < COUNT; i++) {
            int number = Integer.parseInt(READER.readLine());
            NUMBERS[i] = number;
            sum += number;
        }

        Arrays.sort(NUMBERS);

        System.out.println(sum / COUNT);
        System.out.println(NUMBERS[(COUNT - 1) / 2]);
    }
}

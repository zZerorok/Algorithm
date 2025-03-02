import java.io.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter WRITER = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] input = READER.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int x = Integer.parseInt(input[1]);

        String[] numbers = READER.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            if (x > Integer.parseInt(numbers[i])) {
                WRITER.append(numbers[i]).append(" ");
            }
        }
        WRITER.flush();
    }
}

import java.io.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter WRITER = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(READER.readLine());
        for (int i = 1; i <= count; i++) {
            String[] input = READER.readLine().split(" ");
            int result = Integer.parseInt(input[0]) + Integer.parseInt(input[1]);
            WRITER.write("Case #" + i + ": " + input[0] + " + " + input[1] + " = " + result);
            WRITER.newLine();
        }
        WRITER.flush();
    }
}

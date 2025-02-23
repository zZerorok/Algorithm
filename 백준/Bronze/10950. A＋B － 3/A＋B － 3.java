import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(reader.readLine());

        for (int i = 0; i < testCase; i++) {
            String[] split = reader.readLine().split(" ");
            writer.write(Integer.parseInt(split[0]) + Integer.parseInt(split[1]) + System.lineSeparator());
        }

        writer.flush();
    }
}

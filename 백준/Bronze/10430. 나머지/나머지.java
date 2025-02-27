import java.io.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter WRITER = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] input = READER.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);

        WRITER.write((A + B) % C + System.lineSeparator());
        WRITER.write(((A % C) + (B % C)) % C + System.lineSeparator());
        WRITER.write((A * B) % C + System.lineSeparator());
        WRITER.write(((A % C) * (B % C)) % C + System.lineSeparator());
        WRITER.flush();
    }
}

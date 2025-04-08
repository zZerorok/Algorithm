import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter WRITER = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(READER.readLine());
        for (int i = 1; i <= N; i++) {
            WRITER.write(String.valueOf(i));
            WRITER.newLine();
        }
        WRITER.flush();
    }
}

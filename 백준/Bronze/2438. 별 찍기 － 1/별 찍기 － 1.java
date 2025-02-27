import java.io.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter WRITER = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(READER.readLine());
        String star = "*";

        for (int i = 1; i <= count; i++) {
            WRITER.write(star.repeat(i));
            WRITER.newLine();
        }
        
        WRITER.flush();
    }
}

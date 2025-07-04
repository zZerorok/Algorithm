import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer token = new StringTokenizer(reader.readLine());
        long result = 0;
        while (token.hasMoreTokens()) {
            result += Long.parseLong(token.nextToken());
        }

        writer.write(String.valueOf(result));
        writer.flush();
    }
}

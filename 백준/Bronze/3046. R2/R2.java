import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new java.io.OutputStreamWriter(System.out));

        String[] tokens = reader.readLine().split(" ");
        int R1 = Integer.parseInt(tokens[0]);
        int S = Integer.parseInt(tokens[1]);

        writer.write(String.valueOf(S * 2 - R1));
        writer.flush();
    }
}

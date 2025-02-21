import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = reader.readLine();

        for (int i = 0; i < input.length(); i += 10) {
            writer.append(input, i, Math.min(i + 10, input.length()));
            writer.append(System.lineSeparator());
        }
        
        writer.flush();
        writer.close();
    }
}

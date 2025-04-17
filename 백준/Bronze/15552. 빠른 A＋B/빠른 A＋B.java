import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(reader.readLine());
        for (int i = 0; i < testCase; i++) {
            String[] inputs = reader.readLine().split(" ");
            int result = Integer.parseInt(inputs[0]) + Integer.parseInt(inputs[1]);
            writer.write(String.valueOf(result));
            writer.newLine();
        }
        writer.flush();
    }
}

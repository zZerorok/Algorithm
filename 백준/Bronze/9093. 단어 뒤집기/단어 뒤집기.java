import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputCount = Integer.parseInt(reader.readLine());
        for (int i = 0; i < inputCount; i++) {
            String[] inputs = reader.readLine().split(" ");
            StringBuilder builder = new StringBuilder();
            for (String input : inputs) {
                builder.append(reverse(input))
                        .append(" ");
            }
            writer.write(builder.toString());
            writer.newLine();
        }

        writer.flush();
    }

    private static StringBuilder reverse(String input) {
        return new StringBuilder(input).reverse();
    }
}

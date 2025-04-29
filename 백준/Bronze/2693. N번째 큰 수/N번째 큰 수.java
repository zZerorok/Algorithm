import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {

    static final int N = 3;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = parseInt(reader.readLine());
        for (int i = 0; i < T; i++) {
            String line = reader.readLine();
            List<Integer> tokens = parser(line);
            Collections.sort(tokens);
            Integer targetNumber = tokens.get(tokens.size() - N);
            writer.write(String.valueOf(targetNumber));
            writer.newLine();
        }

        writer.flush();
        writer.close();
        reader.close();
    }

    private static List<Integer> parser(String line) {
        List<Integer> tokens = new ArrayList<>();
        String[] inputTokens = line.split(" ");
        for (String inputToken : inputTokens) {
            tokens.add(parseInt(inputToken));
        }
        return tokens;
    }
}

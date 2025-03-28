import java.io.*;
import java.util.Stack;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter WRITER = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int testCase = Integer.parseInt(READER.readLine());
        for (int i = 1; i <= testCase; i++) {
            Stack<String> stack = new Stack<>();
            String[] words = READER.readLine().split(" ");
            for (String word : words) {
                stack.push(word);
            }

            StringBuilder builder = new StringBuilder();
            int size = stack.size();
            for (int j = 1; j <= size; j++) {
                builder.append(stack.pop()).append(" ");
            }

            WRITER.write("Case #" + i + ": " + builder);
            WRITER.newLine();
        }

        WRITER.flush();
    }
}

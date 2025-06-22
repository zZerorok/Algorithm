import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(reader.readLine());
        for (int i = 0; i < count; i++) {
            String input = reader.readLine();
            if (isVPS(input)) {
                writer.write("YES");
                writer.newLine();
            } else {
                writer.write("NO");
                writer.newLine();
            }
        }

        writer.flush();
    }

    private static boolean isVPS(String input) {
        Stack<String> stack = new Stack<>();
        String[] inputs = input.split("");
        for (String token : inputs) {
            if (token.equals("(")) {
                stack.push(token);
            } else if (token.equals(")")) {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}

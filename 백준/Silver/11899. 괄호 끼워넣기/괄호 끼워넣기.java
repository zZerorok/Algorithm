import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<String> stack = new Stack<>();

        String[] brackets = reader.readLine().split("");
        for (String bracket : brackets) {
            if (bracket.equals("(")) {
                stack.push(bracket);
            } else if (bracket.equals(")")) {
                if (!stack.isEmpty() && stack.peek().equals("(")) {
                    stack.pop();
                } else {
                    stack.push(bracket);
                }
            }
        }

        writer.write(String.valueOf(stack.size()));
        writer.flush();
    }
}

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        int goodWordCount = 0;

        for (int i = 0; i < n; i++) {
            String word = reader.readLine();
            if (isGoodWord(word)) {
                goodWordCount++;
            }
        }

        writer.write(String.valueOf(goodWordCount));
        writer.flush();
    }

    private static boolean isGoodWord(String word) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char current : word.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == current) {
                stack.pop();
            } else {
                stack.push(current);
            }
        }
        return stack.isEmpty();
    }
}

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(reader.readLine());

        while (testCase-- > 0) {
            String input = reader.readLine();
            Deque<Character> left = new LinkedList<>();
            Deque<Character> right = new LinkedList<>();

            for (char ch : input.toCharArray()) {
                switch (ch) {
                    case '<':
                        if (!left.isEmpty()) {
                            right.push(left.pop());
                        }
                        break;
                    case '>':
                        if (!right.isEmpty()) {
                            left.push(right.pop());
                        }
                        break;
                    case '-':
                        if (!left.isEmpty()) {
                            left.pop();
                        }
                        break;
                    default:
                        left.push(ch);
                        break;
                }
            }

            StringBuilder result = new StringBuilder();
            while (!left.isEmpty()) {
                result.append(left.removeLast());
            }
            while (!right.isEmpty()) {
                result.append(right.removeFirst());
            }

            System.out.println(result);
        }
    }
}

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(reader.readLine());

        List<String> commands = new ArrayList<>();
        for (int i = 0; i < testCase; i++) {
            commands.add(reader.readLine());
        }

        Deque<Integer> deque = new ArrayDeque<>();
        for (String command : commands) {
            switch (command) {
                case "pop_front":
                    popFront(deque);
                    break;
                case "pop_back":
                    popBack(deque);
                    break;
                case "size":
                    size(deque);
                    break;
                case "empty":
                    empty(deque);
                    break;
                case "front":
                    front(deque);
                    break;
                case "back":
                    back(deque);
                    break;

                default:
                    pushCommand(deque, command);
                    break;
            }

        }
    }

    private static void pushCommand(Deque<Integer> deque, String command) {
        String[] split = command.split(" ");

        if (split[0].equals("push_front")) {
            pushFront(deque, Integer.parseInt(split[1]));
        } else if (split[0].equals("push_back")) {
            pushBack(deque, Integer.parseInt(split[1]));
        }
    }

    private static void pushFront(Deque<Integer> deque, int value) {
        deque.offerFirst(value);
    }

    private static void pushBack(Deque<Integer> deque, int value) {
        deque.offerLast(value);
    }

    private static void popFront(Deque<Integer> deque) {
        System.out.println(deque.isEmpty() ? -1 : deque.pollFirst());
    }

    private static void popBack(Deque<Integer> deque) {
        System.out.println(deque.isEmpty() ? -1 : deque.pollLast());
    }

    private static void size(Deque<Integer> deque) {
        System.out.println(deque.size());
    }

    private static void empty(Deque<Integer> deque) {
        System.out.println(deque.isEmpty() ? 1 : 0);
    }

    private static void front(Deque<Integer> deque) {
        System.out.println(deque.isEmpty() ? -1 : deque.peekFirst());
    }

    private static void back(Deque<Integer> deque) {
        System.out.println(deque.isEmpty() ? -1 : deque.peekLast());
    }
}

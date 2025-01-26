import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();

        Deque<Integer> numbers = new ArrayDeque<>();
        for (int i = 0; i < K; i++) {
            int number = scanner.nextInt();

            if (number == 0) {
                numbers.pollLast();
            } else {
                numbers.offerLast(number);
            }
        }

        System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());
    }
}

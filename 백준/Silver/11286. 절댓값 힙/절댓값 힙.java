import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int calculationCount = Integer.parseInt(scanner.nextLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>(
                (a, b) -> {
                    if (Math.abs(a) != Math.abs(b)) {
                        return Math.abs(a) - Math.abs(b);
                    }
                    return a - b;
                }
        );

        for (int i = 0; i < calculationCount; i++) {
            int value = scanner.nextInt();

            if (value == 0) {
                if (queue.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(queue.poll());
                }
            } else {
                queue.add(value);
            }
        }
    }
}

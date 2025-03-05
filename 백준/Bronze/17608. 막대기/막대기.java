import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Stack<Integer> TOWERS = new Stack<>();

    public static void main(String[] args) throws IOException {
        int N = SCANNER.nextInt();
        for (int i = 0; i < N; i++) {
            TOWERS.push(SCANNER.nextInt());
        }

        int count = 0;
        int temp = 0;
        while (!TOWERS.isEmpty()) {
            Integer tower = TOWERS.pop();
            if (tower > temp) {
                count += 1;
                temp = tower;
            }
        }

        System.out.println(count);
    }
}

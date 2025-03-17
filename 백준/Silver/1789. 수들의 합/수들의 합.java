import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();

        int count = 0;
        long sum = 0;
        while (true) {
            count += 1;
            sum += count;

            if (sum > N) {
                count -= 1;
                break;
            }
        }

        System.out.println(count);
    }
}

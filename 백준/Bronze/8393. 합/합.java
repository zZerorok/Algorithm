import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        System.out.println(IntStream.rangeClosed(1, n).sum());
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println(0);
            return;
        }

        int result = 0;
        int num1 = 0;
        int num2 = 1;
        for (int i = 0; i < n; i++) {
            result = num1 + num2;
            num1 = num2;
            num2 = result;
        }

        System.out.println(num1);
    }
}

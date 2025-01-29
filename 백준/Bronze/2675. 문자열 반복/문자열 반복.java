import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int count = scanner.nextInt();
            String inputStr = scanner.next();

            for (char current : inputStr.toCharArray()) {
                builder.append(String.valueOf(current).repeat(count));
            }
            builder.append(System.lineSeparator());
        }
        System.out.println(builder);
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();

        int count = 0;
        for (int i = 1; i < value.length(); i++) {
            if (value.charAt(i) != value.charAt(i - 1)) {
                count++;
            }
        }

        System.out.println((count + 1) / 2);
    }
}

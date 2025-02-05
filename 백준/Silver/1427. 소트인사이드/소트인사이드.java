import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] digits = scanner.nextLine().toCharArray();

        Arrays.sort(digits);

        StringBuilder builder = new StringBuilder();
        for (char digit : digits) {
            builder.append(digit);
        }

        System.out.println(builder.reverse());
    }
}

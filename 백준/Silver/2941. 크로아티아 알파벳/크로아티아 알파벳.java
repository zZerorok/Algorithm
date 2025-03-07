import java.util.*;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final List<String> CROATIA_ALPHABET = List.of(
            "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="
    );

    public static void main(String[] args) {
        String input = SCANNER.nextLine();

        for (String croatia : CROATIA_ALPHABET) {
            input = input.replace(croatia, "*");
        }

        System.out.println(input.length());
    }
}

import java.util.List;
import java.util.Scanner;

public class Main {

    private static final List<Character> BANNED_ALPHABET = List.of('C', 'A', 'M', 'B', 'R', 'I', 'D', 'G', 'E');
    private static final StringBuilder RESULT = new StringBuilder();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        for (int i = 0; i < word.length(); i++) {
            if (!BANNED_ALPHABET.contains(word.charAt(i))) {
                RESULT.append(word.charAt(i));
            }
        }

        System.out.println(RESULT);
    }
}

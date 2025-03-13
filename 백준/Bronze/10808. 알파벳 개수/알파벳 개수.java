import java.io.*;
import java.util.*;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final StringBuilder BUILDER = new StringBuilder();
    private static final Map<Character, Integer> ALPHABET_COUNT = new HashMap<>();

    static {
        for (char c = 'a'; c <= 'z'; c++) {
            ALPHABET_COUNT.put(c, 0);
        }
    }

    public static void main(String[] args) throws IOException {
        String word = SCANNER.nextLine();

        for (char alphabet : word.toCharArray()) {
            ALPHABET_COUNT.put(alphabet, ALPHABET_COUNT.getOrDefault(alphabet, 0) + 1);
        }

        for (char c = 'a'; c <= 'z'; c++) {
            BUILDER.append(ALPHABET_COUNT.get(c)).append(" ");
        }

        System.out.println(BUILDER);
    }
}

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        List<String> suffixes = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            suffixes.add(word.substring(i));
        }

        Collections.sort(suffixes);

        for (String suffix : suffixes) {
            System.out.println(suffix);
        }
    }
}

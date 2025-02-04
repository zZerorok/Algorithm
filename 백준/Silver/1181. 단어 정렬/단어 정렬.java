import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        Set<String> uniqueWords = new HashSet<>();
        for (int i = 0; i < N; i++) {
            uniqueWords.add(reader.readLine());
        }

        List<String> sortedWords = new ArrayList<>(uniqueWords);
        sortedWords.sort(Comparator.comparingInt(String::length).thenComparing(String::compareTo));
        sortedWords.forEach(System.out::println);
    }
}

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int bookCount = Integer.parseInt(reader.readLine());

        Map<String, Integer> books = new HashMap<>();
        for (int i = 0; i < bookCount; i++) {
            String book = reader.readLine();
            books.put(book, books.getOrDefault(book, 0) + 1);
        }

        int maxCount = 0;
        List<String> bestsellers = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : books.entrySet()) {
            String book = entry.getKey();
            Integer count = entry.getValue();

            if (count > maxCount) {
                maxCount = count;
                bestsellers.clear();
                bestsellers.add(book);
            } else if (count == maxCount) {
                bestsellers.add(book);
            }
        }

        Collections.sort(bestsellers);

        System.out.println(bestsellers.get(0));
    }
}

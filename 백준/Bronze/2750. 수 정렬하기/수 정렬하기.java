import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int number = Integer.parseInt(reader.readLine());
            numbers.add(number);
        }

        numbers.stream()
                .sorted()
                .forEach(System.out::println);
    }
}

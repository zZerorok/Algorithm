import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());

        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] =  Integer.parseInt(reader.readLine());
        }

        Arrays.stream(numbers)
                .sorted()
                .forEach(System.out::println);
    }
}

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        int[] numbers = Arrays.stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        System.out.println(numbers[1]);
    }
}

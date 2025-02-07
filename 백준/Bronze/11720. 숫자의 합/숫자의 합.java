import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String count = reader.readLine();
        String value = reader.readLine();

        List<Integer> numbers = parseToIntegers(value);
        int result = sum(numbers);
        System.out.println(result);
    }

    public static List<Integer> parseToIntegers(String value) {
        return Arrays.stream(value.split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public static int sum(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}

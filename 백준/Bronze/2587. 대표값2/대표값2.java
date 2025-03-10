import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 5;

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(numbers);

        int average = numbers.stream().mapToInt(Integer::intValue).sum() / count;

        Integer medianNumber = numbers.get((count - 1) / 2);

        System.out.println(average);
        System.out.println(medianNumber);
    }
}

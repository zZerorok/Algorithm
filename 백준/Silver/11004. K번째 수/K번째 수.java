import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = reader.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);

        List<Integer> numbers = new ArrayList<>();
        String[] inputNumbers = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            numbers.add(Integer.parseInt(inputNumbers[i]));
        }

        Collections.sort(numbers);

        Integer targetNumber = numbers.get(k - 1);
        writer.write(String.valueOf(targetNumber));
        writer.flush();
    }
}

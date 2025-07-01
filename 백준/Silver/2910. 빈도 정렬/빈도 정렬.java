import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = reader.readLine().split(" ");
        int numberCount = Integer.parseInt(inputs[0]);

        String[] inputNumbers = reader.readLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        Map<Integer, Integer> numberCountMap = new HashMap<>();
        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < numberCount; i++) {
            int number = Integer.parseInt(inputNumbers[i]);
            numbers.add(number);

            numberCountMap.put(number, numberCountMap.getOrDefault(number, 0) + 1);

            if (!indexMap.containsKey(number)) {
                indexMap.put(number, i);
            }
        }

        numbers.sort((a, b) -> {
            int numberA = numberCountMap.get(a);
            int numberB = numberCountMap.get(b);
            if (numberA == numberB) {
                return Integer.compare(indexMap.get(a), indexMap.get(b));
            } else {
                return Integer.compare(numberB, numberA);
            }
        });

        for (int number : numbers) {
            writer.write(number + " ");
        }
        
        writer.flush();
    }
}

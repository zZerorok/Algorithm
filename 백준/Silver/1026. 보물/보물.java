import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(reader.readLine());
        int[] firstNumbers = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Integer[] secondNumbers = Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        Arrays.sort(firstNumbers);
        Arrays.sort(secondNumbers, Collections.reverseOrder());

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += firstNumbers[i] * secondNumbers[i];
        }

        writer.write(String.valueOf(sum));
        writer.flush();
    }
}

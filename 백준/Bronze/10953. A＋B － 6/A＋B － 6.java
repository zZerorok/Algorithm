import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(reader.readLine());

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < testCase; i++) {
            String input = reader.readLine();
            result.add(Arrays.stream(input.split(","))
                    .mapToInt(Integer::parseInt)
                    .sum());
        }
        
        result.forEach(System.out::println);
    }
}

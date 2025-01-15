import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");

        int minSum = calculateSum(input, '6', '5');
        int maxSum = calculateSum(input, '5', '6');

        System.out.println(minSum + " " + maxSum);
    }
    
    private static int calculateSum(String[] input, char from, char to) {
        return Arrays.stream(input)
                .map(num -> Integer.parseInt(num.replace(from, to)))
                .mapToInt(Integer::intValue)
                .sum();
    }
}

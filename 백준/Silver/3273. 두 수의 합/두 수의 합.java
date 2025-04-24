import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberCount = Integer.parseInt(reader.readLine());
        String[] numberTokens = reader.readLine().split(" ");
        int targetSum = Integer.parseInt(reader.readLine());

        int[] numbers = new int[numberCount];
        for (int i = 0; i < numberCount; i++) {
            numbers[i] = Integer.parseInt(numberTokens[i]);
        }

        Arrays.sort(numbers);

        int left = 0;
        int right = numberCount - 1;
        int count = 0;
        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == targetSum) {
                count += 1;
                left += 1;
                right -= 1;
            } else if (sum < targetSum) {
                left += 1;
            } else {
                right -= 1;
            } 
        }

        writer.write(String.valueOf(count));
        writer.flush();
    }
}

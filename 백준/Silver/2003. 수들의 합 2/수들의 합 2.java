import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int numCount = Integer.parseInt(tokenizer.nextToken());
        int targetSum = Integer.parseInt(tokenizer.nextToken());

        int[] numbers = new int[numCount];
        tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < numCount; i++) {
            numbers[i] = Integer.parseInt(tokenizer.nextToken());
        }

        int left = 0;
        int right = 0;
        int sum = 0;
        int count = 0;
        while (right < numCount) {
            sum += numbers[right];

            while (sum > targetSum && left < right) {
                sum -= numbers[left];
                left += 1;
            }

            if (sum == targetSum) {
                count += 1;
            }
            right += 1;
        }
        System.out.println(count);
    }
}

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());

        int[] numbers = new int[11];
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 4;

        for (int i = 4; i < 11; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2] + numbers[i - 3];
        }

        for (int i = 0; i < input; i++) {
            int number = Integer.parseInt(reader.readLine());
            System.out.println(numbers[number]);
        }
    }
}

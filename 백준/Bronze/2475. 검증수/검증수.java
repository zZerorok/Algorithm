import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = reader.readLine().split(" ");
        int result = 0;
        for (int i = 0; i < 5; i++) {
            int digit = Integer.parseInt(inputs[i]);
            result += digit * digit;
        }
        System.out.println(result % 10);
    }
}

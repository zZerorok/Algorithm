import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] values = reader.readLine().split(" ");
        long sum = 0;
        for (int i = 0; i < values.length; i += 2) {
            String attachValue = values[i] + values[i + 1];
            sum += Long.parseLong(attachValue);
        }
        System.out.println(sum);
    }
}

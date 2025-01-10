import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        long[] test = new long[n + 1];
        test[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                test[i] += test[j] * test[i - 1 - j];
            }
        }
        
        System.out.println(test[n]);
    }
}

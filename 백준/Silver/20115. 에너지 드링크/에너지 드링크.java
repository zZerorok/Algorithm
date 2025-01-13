import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        reader.close();
        
        int[] drinks = new int[n];
        for (int i = 0; i < n; i++) {
            drinks[i] = Integer.parseInt(tokenizer.nextToken());
        }

        Arrays.sort(drinks);
        double result = drinks[n - 1];
        for (int i = 0; i < n - 1; i++) {
            result += drinks[i] / 2.0;
        }

        System.out.println(result);
    }
}

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        double maxDrink = 0;
        double totalDrink = 0;
        for (int i = 0; i < n; i++) {
            double currentDrink = Double.parseDouble(tokenizer.nextToken());
            totalDrink += currentDrink;
            maxDrink = Math.max(maxDrink, currentDrink);
        }

        double result = maxDrink + ((totalDrink - maxDrink) / 2);
        System.out.println(result);
    }
}

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int toppingCount = Integer.parseInt(reader.readLine());
        String[] toppings = reader.readLine().split(" ");
        
        Set<String> cheeses = new HashSet<>();
        for (int i = 0; i < toppingCount; i++) {
            String topping = toppings[i];
            if (topping.endsWith("Cheese")) {
                cheeses.add(topping);
            }
        }

        printResult(cheeses.size() >= 4);
    }

    private static void printResult(boolean result) {
        if (result) {
            System.out.println("yummy");
        } else {
            System.out.println("sad");
        }
    }
}

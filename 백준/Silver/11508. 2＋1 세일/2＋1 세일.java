import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> products = new ArrayList<>();
        int count = Integer.parseInt(reader.readLine());
        for (int i = 0; i < count; i++) {
            int price = Integer.parseInt(reader.readLine());
            products.add(price);
        }

        products.sort(Collections.reverseOrder());

        long totalPrice = 0;
        for (int i = 0; i < count; i++) {
            if ((i + 1) % 3 == 0) {
                continue;
            }
            totalPrice += products.get(i);
        }

        writer.write(String.valueOf(totalPrice));
        writer.flush();
    }
}

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Integer> card = new HashMap<>();
        int count = Integer.parseInt(reader.readLine());
        for (int i = 0; i < count; i++) {
            String[] inputs = reader.readLine().split(" ");
            String fruit = inputs[0];
            int value = Integer.parseInt(inputs[1]);
            card.put(fruit, card.getOrDefault(fruit, 0) + value);
        }

        for (Integer value : card.values()) {
            if (value == 5) {
                writer.write("YES");
                writer.flush();
                return;
            }
        }

        writer.write("NO");
        writer.flush();
    }
}

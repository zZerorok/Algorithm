import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        reader.readLine();
        String[] cardNumbers = reader.readLine().split(" ");

        reader.readLine();
        String[] checkCardNumbers = reader.readLine().split(" ");

        Map<String, Integer> cardMap = new HashMap<>();
        for (String cardNumber : cardNumbers) {
            cardMap.put(cardNumber, cardMap.getOrDefault(cardNumber, 0) + 1);
        }

        for (String targetNumber : checkCardNumbers) {
            if (cardMap.containsKey(targetNumber)) {
                writer.write(cardMap.get(targetNumber) + " ");
            } else {
                writer.write("0" + " ");
            }
        }

        writer.flush();
    }
}

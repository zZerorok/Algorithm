import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, Integer> cardMap = new HashMap<>();

        int cardCount = Integer.parseInt(reader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < cardCount; i++) {
            String cardNumber = tokenizer.nextToken();
            cardMap.put(cardNumber, cardMap.getOrDefault(cardNumber, 0) + 1);
        }

        int checkCount = Integer.parseInt(reader.readLine());
        tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < checkCount; i++) {
            String targetNumber = tokenizer.nextToken();
            int count = cardMap.getOrDefault(targetNumber, 0);
            writer.write(count + " ");
        }

        writer.flush();
    }
}

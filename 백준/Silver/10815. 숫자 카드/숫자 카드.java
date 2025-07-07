import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<Long> cards = new HashSet<>();

        long cardCount = Long.parseLong(reader.readLine());
        String[] cardTokens = reader.readLine().split(" ");
        for (int i = 0; i < cardCount; i++) {
            cards.add(Long.parseLong(cardTokens[i]));
        }
        
        long targetCardCount = Long.parseLong(reader.readLine());
        String[] targetCardTokens = reader.readLine().split(" ");
        for (int i = 0; i < targetCardCount; i++) {
            long targetCard = Long.parseLong(targetCardTokens[i]);
            if (cards.contains(targetCard)) {
                writer.write("1" + " ");
            } else {
                writer.write("0" + " ");
            }
        }
        writer.flush();
    }
}

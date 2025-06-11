import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] cardInputs = reader.readLine().split(" ");
        int cardCount = Integer.parseInt(cardInputs[0]);
        int targetNumber = Integer.parseInt(cardInputs[1]);

        String[] cardValues = reader.readLine().split(" ");
        List<Integer> cards = new ArrayList<>();
        for (String cardValue : cardValues) {
            cards.add(Integer.parseInt(cardValue));
        }

        int maxSum = 0;
        for (int i = 0; i < cards.size() - 2; i++) {
            for (int j = i + 1; j < cards.size() - 1; j++) {
                for (int k = j + 1; k < cards.size(); k++) {
                    int sum = cards.get(i) + cards.get(j) + cards.get(k);
                    if (sum <= targetNumber && sum > maxSum) {
                        maxSum = sum;
                    }
                }
            }
        }

        writer.write(String.valueOf(maxSum));
        writer.flush();
    }
}

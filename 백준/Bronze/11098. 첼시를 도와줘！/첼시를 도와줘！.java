
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(reader.readLine());

        for (int i = 0; i < testCase; i++) {
            long maxValue = 0L;
            String maxPlayerName = "";

            int playerCount = Integer.parseInt(reader.readLine());
            for (int j = 0; j < playerCount; j++) {
                String[] split = reader.readLine().split(" ");
                long playerValue = Long.parseLong(split[0]);
                String playerName = split[1];

                if (playerValue > maxValue) {
                    maxValue = playerValue;
                    maxPlayerName = playerName;
                }
            }
            System.out.println(maxPlayerName);
        }
    }
}

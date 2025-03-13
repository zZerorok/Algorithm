import java.io.*;

public class Main {

    public static final int INITIAL_SCORE = 100;

    public static void main(String[] args) throws IOException {
        int changyoungScore = INITIAL_SCORE;
        int sangdeokScore = INITIAL_SCORE;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int round = Integer.parseInt(reader.readLine());
        for (int i = 0; i < round; i++) {
            String[] dices = reader.readLine().split(" ");
            int changyoungDice = Integer.parseInt(dices[0]);
            int sangdeokDice = Integer.parseInt(dices[1]);

            if (changyoungDice > sangdeokDice) {
                sangdeokScore -= changyoungDice;
            } else if (changyoungDice < sangdeokDice) {
                changyoungScore -= sangdeokDice;
            }
        }

        System.out.println(changyoungScore);
        System.out.println(sangdeokScore);
    }
}

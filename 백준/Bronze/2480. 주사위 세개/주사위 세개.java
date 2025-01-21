import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] diceValue = reader.readLine().split(" ");
        int[] dice = Arrays.stream(diceValue)
                .mapToInt(Integer::parseInt)
                .toArray();

        if (dice[0] == dice[1] && dice[1] == dice[2]) {
            System.out.println(10000 + (dice[0] * 1000));
        } else if (dice[0] == dice[1] || dice[0] == dice[2] || dice[1] == dice[2]) {
            int sameNumber = (dice[0] == dice[1] || dice[0] == dice[2] ? dice[0] : dice[1]);
            System.out.println(1000 + (sameNumber * 100));
        } else {
            int max = Math.max(Math.max(dice[0], dice[1]), dice[2]);
            System.out.println(max * 100);
        }
    }
}

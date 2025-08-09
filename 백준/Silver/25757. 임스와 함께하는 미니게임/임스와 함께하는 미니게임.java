import java.io.*;
import java.util.*;

public class Main {

    static final Map<String, Integer> GAME_PLAYER = Map.of(
            "Y", 2,
            "F", 3,
            "O", 4
    );

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int count = Integer.parseInt(tokenizer.nextToken());
        String gameType = tokenizer.nextToken();

        Set<String> players = new HashSet<>((int) (count / 0.75f) + 1);
        for (int i = 0; i < count; i++) {
            players.add(reader.readLine());
        }

        int needPlayer = GAME_PLAYER.get(gameType) - 1;
        int result = players.size() / needPlayer;

        System.out.println(result);
    }
}

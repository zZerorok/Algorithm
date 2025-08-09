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
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = reader.readLine().split(" ");
        int requestCount = Integer.parseInt(inputs[0]);
        String gameType = inputs[1];

        Set<String> players = new HashSet<>();
        for (int i = 0; i < requestCount; i++) {
            players.add(reader.readLine());
        }

        int needPlayer = GAME_PLAYER.get(gameType) - 1;
        int result = players.size() / needPlayer;

        writer.write(String.valueOf(result));
        writer.flush();
    }
}

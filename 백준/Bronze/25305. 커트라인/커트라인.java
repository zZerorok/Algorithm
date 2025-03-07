import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final List<Integer> SCORES = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        String[] inputTokens = READER.readLine().split(" ");
        int applicants = Integer.parseInt(inputTokens[0]);
        int winner = Integer.parseInt(inputTokens[1]);

        String[] scores = READER.readLine().split(" ");
        for (int i = 0; i < applicants; i++) {
            SCORES.add(Integer.parseInt(scores[i]));
        }

        SCORES.sort(Collections.reverseOrder());
        
        System.out.println(SCORES.get(winner - 1));
    }
}

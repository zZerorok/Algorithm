import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int studentCount = Integer.parseInt(reader.readLine());
        String[] studentScores = reader.readLine().split(" ");
        List<Integer> scores = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            scores.add(Integer.parseInt(studentScores[i]));
        }

        Collections.sort(scores);

        int result = scores.get(scores.size() - 1) - scores.get(0);
        writer.write(result + "");
        writer.flush();
    }
}

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int opinionCount = Integer.parseInt(reader.readLine());
        if (opinionCount == 0) {
            writer.write("0");
            writer.flush();
            return;
        }

        int trimCount = (int) Math.round(opinionCount * 0.15);

        List<Integer> difficultyOpinions = new ArrayList<>();
        for (int i = 0; i < opinionCount; i++) {
            difficultyOpinions.add(Integer.parseInt(reader.readLine()));
        }

        Collections.sort(difficultyOpinions);

        int sum = 0;
        for (int i = trimCount; i < opinionCount - trimCount; i++) {
            sum += difficultyOpinions.get(i);
        }

        int validCount = opinionCount - (trimCount * 2);
        int result = (int) Math.round((double) sum / validCount);
        writer.write(String.valueOf(result));
        writer.flush();
    }
}

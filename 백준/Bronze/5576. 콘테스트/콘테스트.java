import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> firstScores = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            firstScores.add(Integer.parseInt(reader.readLine()));
        }
        firstScores.sort(Comparator.reverseOrder());

        int firstResult = 0;
        for (int i = 0; i < 3; i++) {
            firstResult += firstScores.get(i);
        }

        List<Integer> secondScores = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            secondScores.add(Integer.parseInt(reader.readLine()));
        }
        secondScores.sort(Comparator.reverseOrder());

        int secondResult = 0;
        for (int i = 0; i < 3; i++) {
            secondResult += secondScores.get(i);
        }

        writer.write(firstResult + " " + secondResult);
        writer.flush();
    }
}

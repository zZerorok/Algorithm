import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(reader.readLine());
        for (int i = 0; i < testCase; i++) {
            int note1Size = Integer.parseInt(reader.readLine());
            Set<Integer> note1 = new HashSet<>();
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            for (int j = 0; j < note1Size; j++) {
                note1.add(Integer.parseInt(tokenizer.nextToken()));
            }

            int note2Size = Integer.parseInt(reader.readLine());
            tokenizer = new StringTokenizer(reader.readLine());
            for (int j = 0; j < note2Size; j++) {
                int note2Number = Integer.parseInt(tokenizer.nextToken());
                if (note1.contains(note2Number)) {
                    writer.write(String.valueOf(1));
                } else {
                    writer.write(String.valueOf(0));
                }
                writer.newLine();
            }
        }

        writer.flush();
    }
}

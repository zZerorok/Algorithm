import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter WRITER = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int result = 1;
        for (int i = 0; i < 3; i++) {
            result *= Integer.parseInt(READER.readLine());
        }

        Map<Integer, Integer> numberCount = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            numberCount.put(i, 0);
        }

        String[] resultSplit = String.valueOf(result).split("");
        for (String digit : resultSplit) {
            int digitNumber = Integer.parseInt(digit);
            numberCount.put(digitNumber, numberCount.getOrDefault(digitNumber, 0) + 1);
        }

        for (Integer key : numberCount.keySet()) {
            WRITER.write(String.valueOf(numberCount.get(key)));
            WRITER.newLine();
        }

        WRITER.flush();
        WRITER.close();
        READER.close();
    }
}

import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter WRITER = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final List<Integer> VALUES = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        StringTokenizer tokenizer = new StringTokenizer(READER.readLine());
        int firstSize = Integer.parseInt(tokenizer.nextToken());
        int secondSize = Integer.parseInt(tokenizer.nextToken());

        addElements(READER.readLine(), firstSize);
        addElements(READER.readLine(), secondSize);
        sort();
        writeValues();

        WRITER.flush();
        WRITER.close();
        READER.close();
    }

    private static void addElements(String input, int size) {
        StringTokenizer tokenizer = new StringTokenizer(input);
        for (int i = 0; i < size; i++) {
            VALUES.add(Integer.parseInt(tokenizer.nextToken()));
        }
    }

    private static void sort() {
        VALUES.sort(null);
    }

    private static void writeValues() throws IOException {
        StringBuilder builder = new StringBuilder();
        for (Integer value : VALUES) {
            builder.append(value).append(" ");
        }
        WRITER.write(builder.toString());
    }
}

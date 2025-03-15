import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter WRITER = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final List<Integer> COINS = List.of(25, 10, 5, 1);

    public static void main(String[] args) throws IOException {
        int testCase = Integer.parseInt(READER.readLine());
        for (int i = 0; i < testCase; i++) {
            int cents = Integer.parseInt(READER.readLine());
            for (Integer coin : COINS) {
                WRITER.write(cents / coin + " ");
                cents %= coin;
            }
            WRITER.newLine();
        }

        WRITER.flush();
        WRITER.close();
        READER.close();
    }
}

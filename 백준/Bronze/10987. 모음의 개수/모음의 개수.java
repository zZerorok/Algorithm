import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<String> vowels = Set.of("a", "e", "i", "o", "u");
        String[] alphabets = reader.readLine().split("");
        int count = 0;
        for (String alphabet : alphabets) {
            if (vowels.contains(alphabet)) {
                count += 1;
            }
        }

        writer.write(String.valueOf(count));
        writer.flush();
    }
}

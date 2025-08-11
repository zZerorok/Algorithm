import java.io.*;
import java.util.*;

public class Main {

    private static final Set<Character> VOWELS = Set.of(
            'a', 'e', 'i', 'o', 'u',
            'A', 'E', 'I', 'O', 'U'
    );

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        
        while ((line = reader.readLine()) != null) {
            if (line.equals("#")) {
                break;
            }

            int count = 0;
            for (char current : line.toCharArray()) {
                if (VOWELS.contains(current)) {
                    count += 1;
                }
            }

            writer.write(String.valueOf(count));
            writer.newLine();
        }
        
        writer.flush();
    }
}

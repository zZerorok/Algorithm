import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sourceCount = Integer.parseInt(reader.readLine());
        Set<Integer> sources = new HashSet<>();
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < sourceCount; i++) {
            sources.add(Integer.parseInt(tokenizer.nextToken()));
        }

        int targetCount = Integer.parseInt(reader.readLine());
        tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < targetCount; i++) {
            int targetNum = Integer.parseInt(tokenizer.nextToken());

            if (sources.contains(targetNum)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}

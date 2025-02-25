import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] split = READER.readLine().split(" ");
        int basketCount = Integer.parseInt(split[0]);
        int reverseCount = Integer.parseInt(split[1]);

        List<Integer> baskets = new ArrayList<>();
        for (int i = 1; i <= basketCount; i++) {
            baskets.add(i);
        }

        for (int i = 0; i < reverseCount; i++) {
            String[] reverseInfo = READER.readLine().split(" ");
            int startIndex = Integer.parseInt(reverseInfo[0]);
            int endIndex = Integer.parseInt(reverseInfo[1]);

            Collections.reverse(baskets.subList(startIndex - 1, endIndex));
        }

        baskets.forEach(num -> System.out.print(num + " "));
    }
}

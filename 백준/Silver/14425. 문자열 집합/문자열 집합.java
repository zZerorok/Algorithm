import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        var split = reader.readLine().split(" ");
        var setSize = Integer.parseInt(split[0]);
        var querySize = Integer.parseInt(split[1]);

        Set<String> set = new HashSet<>();
        for (int i = 0; i < setSize; i++) {
            var stringSet = reader.readLine();
            set.add(stringSet);
        }

        var count = 0;
        for (int i = 0; i < querySize; i++) {
            var queryString = reader.readLine();
            if (set.contains(queryString)) {
                count += 1;
            }
        }

        System.out.println(count);
    }
}

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] counts = reader.readLine().split(" ");
        int unheardCount = Integer.parseInt(counts[0]);
        int unseenCount = Integer.parseInt(counts[1]);

        Set<String> unheardPeople = new HashSet<>();
        for (int i = 0; i < unheardCount; i++) {
            unheardPeople.add(reader.readLine());
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < unseenCount; i++) {
            String name = reader.readLine();
            if (unheardPeople.contains(name)) {
                result.add(name);
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        result.forEach(System.out::println);
    }
}

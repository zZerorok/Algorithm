import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] counts = reader.readLine().split(" ");
        String[] targetTokens = reader.readLine().split(" ");
        String[] filterTokens = reader.readLine().split(" ");

        Set<Integer> filterSet = Arrays.stream(filterTokens)
                .map(Integer::parseInt)
                .collect(Collectors.toSet());

        List<Integer> result = Arrays.stream(targetTokens)
                .map(Integer::parseInt)
                .filter(it -> !filterSet.contains(it))
                .sorted()
                .collect(Collectors.toList());

        if (result.isEmpty()) {
            writer.write("0");
        } else {
            writer.write(String.valueOf(result.size()));
            writer.newLine();
            writer.write(result.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(" ")));
        }

        writer.flush();
    }
}

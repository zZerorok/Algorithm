import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static final String ASCENDING = "INCREASING";
    public static final String DESCENDING = "DECREASING";
    public static final String NEITHER = "NEITHER";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int nameCount = Integer.parseInt(reader.readLine());
        List<String> names = new ArrayList<>();
        for (int i = 0; i < nameCount; i++) {
            names.add(reader.readLine());
        }

        List<String> ascNames = ascending(names);
        List<String> descNames = descending(names);

        String result = checkSorting(names, ascNames, descNames);

        writer.write(result);
        writer.flush();
    }

    private static List<String> ascending(List<String> names) {
        return names.stream()
                .sorted()
                .collect(Collectors.toUnmodifiableList());
    }

    private static List<String> descending(List<String> names) {
        return names.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toUnmodifiableList());
    }

    private static String checkSorting(List<String> names, List<String> ascNames, List<String> descNames) {
        return names.equals(ascNames) ? ASCENDING :
                names.equals(descNames) ? DESCENDING :
                        NEITHER;
    }
}

import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter WRITER = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int cardCount = Integer.parseInt(READER.readLine());
        Map<Long, Integer> frequencyMap = initCardMap(cardCount);
        int maxFrequency = getMaxFrequency(frequencyMap);
        long result = findMinKeyWithMaxFrequency(frequencyMap, maxFrequency);
        printResult(result);
    }

    private static Map<Long, Integer> initCardMap(int cardCount) throws IOException {
        Map<Long, Integer> map = new TreeMap<>();
        for (int i = 0; i < cardCount; i++) {
            long number = Long.parseLong(READER.readLine());
            map.merge(number, 1, Integer::sum);
        }
        return map;
    }

    private static int getMaxFrequency(Map<Long, Integer> map) {
        return Collections.max(map.values());
    }

    private static long findMinKeyWithMaxFrequency(Map<Long, Integer> map, int maxFrequency) {
        for (Map.Entry<Long, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                return entry.getKey();
            }
        }
        return -1;
    }

    private static void printResult(long result) throws IOException {
        WRITER.write(String.valueOf(result));
        WRITER.flush();
    }
}

import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int cardCount = Integer.parseInt(READER.readLine());
        Map<Long, Integer> frequencyMap = initCardMap(cardCount);
        long result = findMinKeyWithMaxFrequency(frequencyMap);
        System.out.println(result);
    }

    private static Map<Long, Integer> initCardMap(int cardCount) throws IOException {
        Map<Long, Integer> map = new TreeMap<>();
        
        for (int i = 0; i < cardCount; i++) {
            long number = Long.parseLong(READER.readLine());
            map.merge(number, 1, Integer::sum);
        }
        
        return map;
    }

    private static long findMinKeyWithMaxFrequency(Map<Long, Integer> map) {
        int maxFrequency = 0;
        long resultKey = Long.MAX_VALUE;
        
        for (Map.Entry<Long, Integer> entry : map.entrySet()) {
            long key = entry.getKey();
            int frequency = entry.getValue();
            
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                resultKey = key;
            } else if (frequency == maxFrequency && key < resultKey) {
                resultKey = key;
            }
        }
        
        return resultKey;
    }
}

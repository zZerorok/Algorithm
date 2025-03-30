import java.io.*;
import java.util.*;

public class Main {

    static Map<Long, Integer> frequencyMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int cardCount = Integer.parseInt(reader.readLine());
        for (int i = 0; i < cardCount; i++) {
            long number = Long.parseLong(reader.readLine());
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        int maxFrequency = frequencyMap.values().stream().max(Integer::compareTo).get();
        List<Long> result = new ArrayList<>();
        for (Map.Entry<Long, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                result.add(entry.getKey());
            }
        }
        
        Collections.sort(result);

        System.out.println(result.get(0));
    }
}

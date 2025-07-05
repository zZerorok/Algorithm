import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine().toUpperCase();

        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : input.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        int max = Collections.max(freq.values());
        List<Character> maxChars = new ArrayList<>();

        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == max) {
                maxChars.add(entry.getKey());
                if (maxChars.size() > 1) break;
            }
        }

        System.out.println(maxChars.size() > 1 ? "?" : maxChars.get(0));
    }
}

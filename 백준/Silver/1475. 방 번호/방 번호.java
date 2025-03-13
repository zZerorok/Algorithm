import java.util.*;

public class Main {

    private static final Map<String, Integer> NUMBERS = new HashMap<>();
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String[] roomNumbers = SCANNER.nextLine().split("");
        for (String roomNumber : roomNumbers) {
            NUMBERS.put(roomNumber, NUMBERS.getOrDefault(roomNumber, 0) + 1);
        }

        int sixNineCount = NUMBERS.getOrDefault("6", 0) + NUMBERS.getOrDefault("9", 0);
        int maxCount = (sixNineCount + 1) / 2;

        for (Map.Entry<String, Integer> entry : NUMBERS.entrySet()) {
            String key = entry.getKey();
            if (key.equals("6") || key.equals("9")) {
                continue;
            }

            if (maxCount < entry.getValue()) {
                maxCount = entry.getValue();
            }
        }

        System.out.println(maxCount);
    }
}

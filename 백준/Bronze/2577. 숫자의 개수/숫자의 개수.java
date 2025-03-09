import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int result = 1;
        for (int i = 0; i < 3; i++) {
            result *= scanner.nextInt();
        }

        Map<Integer, Integer> numberCount = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            numberCount.put(i, 0);
        }

        String[] resultSplit = String.valueOf(result).split("");
        for (String digit : resultSplit) {
            int digitNumber = Integer.parseInt(digit);
            numberCount.put(digitNumber, numberCount.getOrDefault(digitNumber, 0) + 1);
        }

        for (Integer key : numberCount.keySet()) {
            System.out.println(numberCount.get(key));
        }
    }
}

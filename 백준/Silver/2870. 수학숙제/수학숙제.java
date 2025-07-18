import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        List<BigInteger> extractedNumbers = new ArrayList<>();

        int lineCount = Integer.parseInt(reader.readLine());
        for (int i = 0; i < lineCount; i++) {
            String line = reader.readLine();
            StringBuilder builder = new StringBuilder();

            for (int j = 0; j < line.length(); j++) {
                char current = line.charAt(j);

                if (!Character.isDigit(current)) {
                    if (!builder.isEmpty()) {
                        extractedNumbers.add(parseBigInt(builder.toString()));
                        builder.setLength(0);
                    }
                    continue;
                }

                builder.append(current);
            }

            if (!builder.isEmpty()) {
                extractedNumbers.add(parseBigInt(builder.toString()));
            }
        }

        Collections.sort(extractedNumbers);

        for (BigInteger number : extractedNumbers) {
            writer.write(number.toString());
            writer.newLine();
        }

        writer.flush();
    }

    private static BigInteger parseBigInt(String input) {
        String trimmed = input.replaceFirst("^0+", "");
        if (trimmed.isEmpty()) {
            return BigInteger.ZERO;
        }
        return new BigInteger(trimmed);
    }
}

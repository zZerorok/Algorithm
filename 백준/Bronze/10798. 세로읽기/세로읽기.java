import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = new String[5];
        for (int i = 0; i < 5; i++) {
            input[i] = reader.readLine();
        }

        StringBuilder result = new StringBuilder();
        int maxLength = 0;
        for (String line : input) {
            if (line.length() > maxLength) {
                maxLength = line.length();
            }
        }

        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < 5; j++) {
                if (i < input[j].length()) {
                    result.append(input[j].charAt(i));
                }
            }
        }

        System.out.println(result);
    }
}

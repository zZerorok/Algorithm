import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

            String[] inputTokens = reader.readLine().split(" ");
            String value = inputTokens[0];
            int count = Integer.parseInt(inputTokens[1]);

            writer.write(value.repeat(count));
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}                    
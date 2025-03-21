import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter WRITER = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int testCase = Integer.parseInt(READER.readLine());
        for (int i = 0; i < testCase; i++) {
            String[] words = READER.readLine().split(" ");
            String word1 = words[0];
            String word2 = words[1];

            if (isAnagram(word1, word2)) {
                WRITER.write(word1 + " & " + word2 + " are anagrams.");
                WRITER.newLine();
            } else {
                WRITER.write(word1 + " & " + word2 + " are NOT anagrams.");
                WRITER.newLine();
            }
        }

        WRITER.flush();
        WRITER.close();
        READER.close();
    }

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        char[] array1 = a.toCharArray();
        char[] array2 = b.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }
}

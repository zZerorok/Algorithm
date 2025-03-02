import java.io.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int wordCount = Integer.parseInt(READER.readLine());

        int result = 0;
        for (int i = 0; i < wordCount; i++) {
            if (isGroupWord(READER.readLine())) {
                result += 1;
            }
        }
        System.out.println(result);
    }

    private static boolean isGroupWord(String word) {
        if (word.length() == 1 || word.length() == 2) {
            return true;
        }

        String[] alphabet = word.split("");
        int index = 0;
        while (index < alphabet.length) {
            String currentWord = alphabet[index];
            for (int i = index + 1; i < alphabet.length; i++) {
                if (currentWord.equals(alphabet[i - 1])) {
                    continue;
                }

                if (currentWord.equals(alphabet[i])) {
                    return false;
                }
            }
            index += 1;
        }
        return true;
    }
}

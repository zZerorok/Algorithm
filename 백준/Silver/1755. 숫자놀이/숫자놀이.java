import java.io.*;
import java.util.*;

public class Main {

    private static final Map<Integer, String> DIGIT_WORDS = Map.of(
            0, "zero", 1, "one", 2, "two", 3, "three", 4, "four",
            5, "five", 6, "six", 7, "seven", 8, "eight", 9, "nine"
    );

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(reader.readLine());
        int startNumber = Integer.parseInt(st.nextToken());
        int endNumber = Integer.parseInt(st.nextToken());

        List<NumberWord> numberWords = convertToNumberWords(startNumber, endNumber);
        numberWords.sort(Comparator.comparing(n -> n.word));

        printSortedNumbers(numberWords, writer);

        writer.flush();
    }

    private static List<NumberWord> convertToNumberWords(int start, int end) {
        List<NumberWord> result = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            result.add(new NumberWord(i, toEnglish(i)));
        }
        return result;
    }

    private static String toEnglish(int number) {
        if (number < 10) {
            return DIGIT_WORDS.get(number);
        }
        int tens = number / 10;
        int ones = number % 10;
        return DIGIT_WORDS.get(tens) + " " + DIGIT_WORDS.get(ones);
    }

    private static void printSortedNumbers(List<NumberWord> list, BufferedWriter writer) throws IOException {
        for (int i = 0; i < list.size(); i++) {
            writer.write(list.get(i).number + " ");
            if ((i + 1) % 10 == 0) {
                writer.newLine();
            }
        }
    }

    private static class NumberWord {
        int number;
        String word;

        NumberWord(int number, String word) {
            this.number = number;
            this.word = word;
        }
    }
}

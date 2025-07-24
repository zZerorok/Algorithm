import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    private static final int NUMBERS_PER_LINE = 10;
    private static final Map<Integer, String> DIGIT_WORDS = new HashMap<>();

    static {
        DIGIT_WORDS.put(0, "zero");
        DIGIT_WORDS.put(1, "one");
        DIGIT_WORDS.put(2, "two");
        DIGIT_WORDS.put(3, "three");
        DIGIT_WORDS.put(4, "four");
        DIGIT_WORDS.put(5, "five");
        DIGIT_WORDS.put(6, "six");
        DIGIT_WORDS.put(7, "seven");
        DIGIT_WORDS.put(8, "eight");
        DIGIT_WORDS.put(9, "nine");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int startNumber = Integer.parseInt(tokenizer.nextToken());
        int endNumber = Integer.parseInt(tokenizer.nextToken());

        List<NumberWord> numberWords = convertToNumberWords(startNumber, endNumber);
        
        numberWords.sort(Comparator.comparing(n -> n.word));

        printNumbers(numberWords, writer);

        writer.flush();
    }

    private static List<NumberWord> convertToNumberWords(int start, int end) {
        return IntStream.rangeClosed(start, end)
                .mapToObj(num -> new NumberWord(num, toEnglish(num)))
                .collect(Collectors.toList());
    }

    private static String toEnglish(int number) {
        if (number < 10) {
            return DIGIT_WORDS.get(number);
        }

        StringBuilder builder = new StringBuilder();
        for (char digit : String.valueOf(number).toCharArray()) {
            builder.append(DIGIT_WORDS.get(digit - '0'));
        }
        return builder.toString();
    }

    private static void printNumbers(List<NumberWord> list, BufferedWriter writer) throws IOException {
        for (int i = 0; i < list.size(); i++) {
            writer.write(String.valueOf(list.get(i).number));
            if (i % NUMBERS_PER_LINE == NUMBERS_PER_LINE - 1) {
                writer.newLine();
            } else {
                writer.write(" ");
            }
        }
    }

    private static final class NumberWord {
        final int number;
        final String word;

        NumberWord(int number, String word) {
            this.number = number;
            this.word = word;
        }
    }
}

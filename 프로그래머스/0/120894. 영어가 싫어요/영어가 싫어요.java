import java.util.Map;

class Solution {

        static private final Map<String, String> DICTIONARY = Map.of(
                "zero", "0",
                "one", "1",
                "two", "2",
                "three", "3",
                "four", "4",
                "five", "5",
                "six", "6",
                "seven", "7",
                "eight", "8",
                "nine", "9"
        );

    public long solution(String numbers) {
        for (Map.Entry<String, String> entry : DICTIONARY.entrySet()) {
            numbers = numbers.replace(entry.getKey(), entry.getValue());
        }

        return Long.parseLong(numbers);
    }
}

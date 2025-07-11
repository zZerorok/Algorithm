import java.util.Map;

class Solution {

    public long solution(String numbers) {
        String [] dictionary = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < dictionary.length; i++) {
            numbers = numbers.replace(dictionary[i], String.valueOf(i));
        }
        
        return Long.parseLong(numbers);
    }
}

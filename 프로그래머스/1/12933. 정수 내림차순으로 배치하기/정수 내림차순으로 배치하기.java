import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        List<String> numbers = Arrays.asList(String.valueOf(n).split(""));
        numbers.sort(Comparator.reverseOrder());
        
        StringBuilder builder = new StringBuilder();
        for (String number : numbers) {
            builder.append(number);
        }
        
        answer = Long.parseLong(String.valueOf(builder));

        return answer;
    }
}
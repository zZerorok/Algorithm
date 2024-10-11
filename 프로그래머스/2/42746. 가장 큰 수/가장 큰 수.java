import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String[] stringNumbers = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);
        
        Arrays.sort(stringNumbers, (a, b) -> (b + a).compareTo(a + b));
        
        if (stringNumbers[0].equals("0")) {
            return "0";
        }
        
        StringBuilder answer = new StringBuilder();
        for (String stringNumber : stringNumbers) {
            answer.append(stringNumber);
        }
        
        return answer.toString();
    }
}
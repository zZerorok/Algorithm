import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] numbers = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (String number : numbers) {
            int result = Integer.parseInt(number);

            if (result > max) {
                max = result;
            }
            
            if (result < min) {
                min = result;
            }
        }

        return min + " " + max;
    }
}
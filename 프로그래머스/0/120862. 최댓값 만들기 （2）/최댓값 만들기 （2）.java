import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        if (numbers[0] >= 0) {
            return numbers[numbers.length - 2] * numbers[numbers.length - 1];
        }

        int minusMaxResult = numbers[0] * numbers[1];
        int maxResult = numbers[numbers.length - 2] * numbers[numbers.length - 1];
        return Math.max(minusMaxResult, maxResult);
    }
}
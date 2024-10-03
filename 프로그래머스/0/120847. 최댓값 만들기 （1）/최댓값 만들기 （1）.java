import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int firstMax = numbers[numbers.length - 1];
        int secondMax = numbers[numbers.length - 2];

        return firstMax * secondMax;
    }
}
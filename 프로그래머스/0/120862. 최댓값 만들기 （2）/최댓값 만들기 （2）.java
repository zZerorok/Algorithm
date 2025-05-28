import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int length = numbers.length;
        int smallest = numbers[0] * numbers[1];
        int largest = numbers[length - 2] * numbers[length - 1];
        return Math.max(smallest, largest);
    }
}
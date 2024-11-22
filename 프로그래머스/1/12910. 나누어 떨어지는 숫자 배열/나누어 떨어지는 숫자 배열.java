import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> result = new ArrayList<>();

        for (int number : arr) {
            if (number % divisor == 0) {
                result.add(number);
            }
        }

        if (result.isEmpty()) {
            return new int[]{-1};
        }

        return result.stream()
            .sorted()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int number) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            numbers.add(i);
        }

        return numbers.stream()
                .filter(it -> it % 2 != 0)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
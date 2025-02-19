import java.util.Arrays;

class Solution {
    public int solution(String number) {
        var split = number.split("");
        var sum = Arrays.stream(split)
                .mapToInt(Integer::parseInt)
                .sum();

        return sum % 9;
    }
}
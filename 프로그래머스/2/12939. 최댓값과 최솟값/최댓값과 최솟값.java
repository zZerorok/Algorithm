import java.util.Arrays;

class Solution {
    public String solution(String s) {
        int max = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).max().getAsInt();
        int min = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).min().getAsInt();

        return min + " " + max;
    }
}
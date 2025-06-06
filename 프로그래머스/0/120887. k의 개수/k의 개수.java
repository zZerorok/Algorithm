import java.util.Arrays;

class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        for (int num = i; num <= j; num++) {
            String[] split = String.valueOf(num).split("");
            count += (int) Arrays.stream(split)
                    .filter(it -> it.equals(String.valueOf(k)))
                    .count();
        }
        return count;
    }
}
import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);

        int totalPrice = 0;
        for (int i = score.length - m; i >= 0; i -= m) {
            totalPrice += score[i] * m;
        }

        return totalPrice;
    }
}
class Solution {
    public int solution(int a, int b) {
        int sum = Integer.parseInt("" + a + b);
        int multiply = 2 * a * b;

        return Math.max(sum, multiply);
    }
}
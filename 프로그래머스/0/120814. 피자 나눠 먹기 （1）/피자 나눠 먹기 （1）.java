class Solution {
    public int solution(int n) {
       int answer = 1;

        if (n < 8) {
            return answer;
        }

        int pizzaCount = 1;
        while (true) {
            pizzaCount = 7 * answer;

            if (pizzaCount >= n) {
                return answer;
            }
            answer++;
        }
    }
}
class Solution {
    public String solution(int n) {
        String answer = "수박";
        int count = n / 2;

        if (n % 2 == 0) {
            return answer.repeat(count);
        } else {
            return answer.repeat(count) + "수";
        }
    }
}
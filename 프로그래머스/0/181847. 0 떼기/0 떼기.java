class Solution {
    public String solution(String n_str) {
        StringBuilder answer = new StringBuilder(n_str);

        while (answer.charAt(0) == '0') {
            answer.deleteCharAt(0);
        }

        return answer.toString();
    }
}
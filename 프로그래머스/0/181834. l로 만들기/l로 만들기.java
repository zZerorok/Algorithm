class Solution {
    public String solution(String myString) {
        char ch = 'l';
        StringBuilder answer = new StringBuilder();

        for (char current : myString.toCharArray()) {
            if (current < ch) {
                answer.append(ch);
            } else {
                answer.append(current);
            }
        }

        return answer.toString();
    }
}
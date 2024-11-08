class Solution {
    public int solution(String myString, String pat) {
        StringBuilder answer = new StringBuilder();
        
        for (char current : pat.toCharArray()) {
            if (current == 'A') {
                answer.append('B');
            } else {
                answer.append('A');
            }
        }
        
        return myString.contains(answer.toString()) ? 1 : 0;
    }
}
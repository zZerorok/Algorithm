class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] strings = String.valueOf(n).split("");
        
        for (String string : strings) {
            answer += Integer.parseInt(string);
        }
        return answer;
    }
}
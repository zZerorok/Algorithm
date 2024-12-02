class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        char[] chars = cipher.toCharArray();
        
        for (int i = code - 1; i < cipher.length(); i += code) {
                answer.append(chars[i]);
        }

        return answer.toString();
    }
}
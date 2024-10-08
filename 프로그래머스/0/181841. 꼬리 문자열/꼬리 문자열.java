class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        
        for (String string : str_list) {
            if(!string.contains(ex)) {
                answer += string;
            }
        }
        
        return answer;
    }
}
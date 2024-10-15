class Solution {
    public String solution(String s) {
       StringBuilder answer = new StringBuilder();
        
        String[] split = s.split(" ", -1);
        
        for (int i = 0; i < split.length; i++) {
            String string = split[i];

            if (!string.isEmpty()) {
                String firstString = string.substring(0, 1).toUpperCase();
                String remainString = string.substring(1).toLowerCase();
                answer.append(firstString).append(remainString);
            }
            
            if (i < split.length - 1) {
                answer.append(" ");
            }
        }
        return answer.toString();
    }
}
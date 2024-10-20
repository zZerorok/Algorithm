class Solution {
    public String solution(String s) {
        char[] split = s.toCharArray();

        if (split.length % 2 != 0) {
            return String.valueOf(split[s.length() / 2]);
        } else {
            return String.valueOf(split[split.length / 2 - 1]) 
                + (split[split.length / 2]);
        }
    }
}
class Solution {
    public int solution(String t, String p) {
        var value = Long.parseLong(p);
        int count = 0;

        for (int i = 0; i <= t.length() - p.length(); i++) {
            if (Long.parseLong(t.substring(i, i + p.length())) <= value) {
                count++;
            }
        }
        
        return count;
    }
}
class Solution {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) {
           return false;
        }

        for (char current : s.toCharArray()) {
            if (!Character.isDigit(current)) {
                return false;
            }
        }

        return true;
    }
}
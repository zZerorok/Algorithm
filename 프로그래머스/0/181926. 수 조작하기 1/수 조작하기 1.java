class Solution {
    public int solution(int n, String control) {
        for (char current : control.toCharArray()) {
            if (current == 'w') {
                n += 1;
            } else if (current == 's') {
                n -= 1;
            } else if (current == 'd') {
                n += 10;
            } else if (current == 'a') {
                n -= 10;
            }
        }

        return n;
    }
}
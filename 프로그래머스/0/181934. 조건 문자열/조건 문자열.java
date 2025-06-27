class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        return compare(ineq, eq, n, m) ? 1 : 0;
    }

    private boolean compare(String ineq, String eq, int n, int m) {
        if (ineq.equals("<") && eq.equals("=")) {
            return n <= m;
        }

        if (ineq.equals("<") && eq.equals("!")) {
            return n < m;
        }

        if (ineq.equals(">") && eq.equals("=")) {
            return n >= m;
        }

        if (ineq.equals(">") && eq.equals("!")) {
            return n > m;
        }
        
        return false;
    }
}
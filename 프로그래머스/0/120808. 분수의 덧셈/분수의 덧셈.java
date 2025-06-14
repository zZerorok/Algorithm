class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int lcm = lcm(denom1, denom2);
        int sum = numer1 * (lcm / denom1) + numer2 * (lcm / denom2);
        int gcd = gcd(sum, lcm);
        return new int[]{sum / gcd, lcm / gcd};
    }

    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
class Solution {
    public int solution(int a, int b, int n) {
       int totalColas = 0;

        while (n >= a) {
            int exchangeColas = n / a;
            int newColas = exchangeColas * b;
            int remainColas = n % a;
            n = newColas + remainColas;
            totalColas += newColas;
        }
        
        return totalColas;
    }
}
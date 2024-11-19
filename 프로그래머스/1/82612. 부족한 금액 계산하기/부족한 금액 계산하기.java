class Solution {
    public long solution(int price, int money, int count) {
        long totalPrice = (long) price * count * (count + 1) / 2;
        
        return Math.max(0, totalPrice - money);
    }
}
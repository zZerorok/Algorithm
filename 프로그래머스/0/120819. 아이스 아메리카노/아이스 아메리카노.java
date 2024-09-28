class Solution {
    public int[] solution(int money) {
       int americanoPrice = 5500;

        int americanoCount = money / americanoPrice;
        int balance = money % americanoPrice;

        return new int[]{americanoCount, balance};
    }
}
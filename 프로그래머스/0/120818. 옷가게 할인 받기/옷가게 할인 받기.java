class Solution {
    public int solution(int price) {
        int discountPrice = price;

        if (price >= 100000) {
            discountPrice = (int) (0.95 * price);
        }

        if (price >= 300000) {
            discountPrice = (int) (0.90 * price);
        }

        if (price >= 500000) {
            discountPrice =  (int) (0.80 * price);
        }
        return discountPrice;
    }
}
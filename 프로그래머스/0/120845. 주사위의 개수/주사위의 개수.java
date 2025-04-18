class Solution {
    public static int solution(int[] box, int n) {
        int lengthDices = divide(box[0], n);
        int widthDices =divide(box[1], n);
        int heightDices = divide(box[2], n);
        return lengthDices * widthDices * heightDices;
    }

    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}
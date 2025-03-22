class Solution {
    private static final int PIECES_PER_PIZZA = 6;
    
    public int solution(int n) {
        int count = 1;
        while ((PIECES_PER_PIZZA * count) % n != 0) {
            count += 1;
        }

        return count;
    }
}
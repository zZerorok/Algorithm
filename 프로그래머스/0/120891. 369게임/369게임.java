class Solution {
    public int solution(int order) {
        String[] numbers = String.valueOf(order).split("");
        int count = 0;
        
        for (String number : numbers) {
            int num = Integer.parseInt(number);
            if (num == 3 || num == 6 || num == 9) {
                count += 1;
            }
        }
        
        return count;
    }
}
class Solution {
    public int[] solution(int[] sequence, int k) {
        int start = 0;
        int currentSum = 0;
        int resultStart = 0;
        int resultEnd = 0;
        int minLength = Integer.MAX_VALUE;

        for (int end = 0; end < sequence.length; end++) {
            currentSum += sequence[end];

            while (currentSum >= k) {
                if (currentSum == k) {
                    int length = end - start;

                    if (length < minLength) {
                        minLength = length;
                        resultStart = start;
                        resultEnd = end;
                    }
                }

                currentSum -= sequence[start];
                start++;
            }
        }
        return new int[]{resultStart, resultEnd};
    }
}
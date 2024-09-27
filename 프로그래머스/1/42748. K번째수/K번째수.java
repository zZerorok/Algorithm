import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] resultArray = new int[commands.length];

        for (int index = 0; index < commands.length; index++) {
            int i = commands[index][0];
            int j = commands[index][1];
            int k = commands[index][2];
            resultArray[index] = getTargetNumber(array, i, j, k);
        }
        return resultArray;
    }

    private static int getTargetNumber(int[] array, int i, int j, int k) {
        return IntStream.rangeClosed(i - 1, j - 1)
                .map(number -> array[number])
                .sorted()
                .toArray()[k - 1];
    }
}
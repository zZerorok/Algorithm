import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        return Arrays.stream(commands)
                .mapToInt(command -> getNumberFromArray(array, command))
                .toArray();
    }

    private static int getNumberFromArray(int[] array, int[] command) {
        return Arrays.stream(array, command[0] - 1, command[1])
                .sorted()
                .skip(command[2] - 1)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("No element found"));
    }
}
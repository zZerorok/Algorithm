import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        String replaced = alphabetToSpace(my_string);
        if (replaced.isBlank()) {
            return 0;
        }

        String[] splitSpace = removeSpace(replaced);
        return getSum(splitSpace);
    }

    private String alphabetToSpace(String input) {
        return input.replaceAll("[a-zA-Z]", " ");
    }

    private String[] removeSpace(String input) {
        return input.trim().split(" +");
    }

    private int getSum(String[] inputs) {
        return Arrays.stream(inputs)
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
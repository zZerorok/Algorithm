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

    private static int getSum(String[] inputs) {
        int sum = 0;
        for (String input : inputs) {
            sum += Integer.parseInt(input);
        }
        return sum;
    }
}

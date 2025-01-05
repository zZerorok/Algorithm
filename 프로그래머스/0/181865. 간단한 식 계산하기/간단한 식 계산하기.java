class Solution {
    public int solution(String binomial) {
        String[] split = binomial.split(" ");
        int firstNum = Integer.parseInt(split[0]);
        int secondNum = Integer.parseInt(split[2]);

        return switch (split[1]) {
            case "+" -> firstNum + secondNum;
            case "-" -> firstNum - secondNum;
            case "*" -> firstNum * secondNum;
            default -> throw new IllegalArgumentException();
        };
    }
}
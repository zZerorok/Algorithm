class Solution {
    public int solution(String binomial) {
        String[] split = binomial.split(" ");
        int firstNum = Integer.parseInt(split[0]);
        int secondNum = Integer.parseInt(split[2]);

        switch (split[1]) {
            case "+" -> {
                return firstNum + secondNum;
            }
            case "-" -> {
                return firstNum - secondNum;
            }
            case "*" -> {
                return firstNum * secondNum;
            }
        }
        return 0;
    }
}
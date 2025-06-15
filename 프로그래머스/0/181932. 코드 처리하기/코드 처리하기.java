class Solution {
    
    public static final String MODE_CHANGE = "1";
    private static final int EVEN = 0;

    private static int MODE;
    
    public String solution(String code) {
        StringBuilder result = new StringBuilder();
        String[] codes = code.split("");
        for (int i = 0; i < code.length(); i++) {
            if (codes[i].equals(MODE_CHANGE)) {
                changeMode();
                continue;
            }
            
            operation(result, codes[i], i);
        }

        if (isEmpty(result)) {
            result.append("EMPTY");
        }

        return result.toString();
    }

    private  void validateMode(String code) {
        if (code.equals(MODE_CHANGE)) {
            changeMode();
        }
    }

    private void changeMode() {
        MODE = 1 - MODE;
    }

    private void operation(StringBuilder result, String code, int index) {
        if (isEven(index) || isOdd(index)) {
            result.append(code);
        }
    }

    private boolean isEven(int index) {
        return MODE == EVEN && index % 2 == 0;
    }

    private boolean isOdd(int index) {
        return MODE != EVEN && index % 2 != 0;
    }

    private boolean isEmpty(StringBuilder result) {
        return result.toString().isEmpty();
    }
}
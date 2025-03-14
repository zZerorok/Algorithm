import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String firstValue = reader.readLine();
        String secondValue = reader.readLine();

        String[] digits = secondValue.split("");
        for (int i = digits.length - 1; i >= 0; i--) {
            String partialResult = multiplyAndReturnString(firstValue, digits[i]);
            writer.write(partialResult);
            writer.newLine();
        }

        String finalResult = multiplyAndReturnString(firstValue, secondValue);
        writer.write(finalResult);
        
        writer.flush();
    }

    private static String multiplyAndReturnString(String firstValue, String secondValue) {
        int firstNum = Integer.parseInt(firstValue);
        int secondNum = Integer.parseInt(secondValue);
        return String.valueOf(firstNum * secondNum);
    }
}

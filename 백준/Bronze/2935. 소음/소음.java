import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger num1 = new BigInteger(reader.readLine());
        String operator = reader.readLine();
        BigInteger num2 = new BigInteger(reader.readLine());

        BigInteger result;

        if (operator.equals("+")) {
            result = num1.add(num2);
        } else {
            result = num1.multiply(num2);
        }

        writer.write(result.toString());
        writer.flush();
    }
}

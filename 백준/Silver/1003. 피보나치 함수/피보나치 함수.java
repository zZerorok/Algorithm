import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int test = Integer.parseInt(reader.readLine());

        int[] zero = new int[41];
        int[] one = new int[41];

        zero[0] = 1;
        zero[1] = 0;
        one[0] = 0;
        one[1] = 1;

        for (int i = 2; i <= 40; i++) {
            zero[i] = zero[i - 1] + zero[i - 2];
            one[i] = one[i - 1] + one[i - 2];
        }

        for (int i = 0; i < test; i++) {
            int n = Integer.parseInt(reader.readLine());
            builder.append(zero[n]).append(" ").append(one[n]).append(System.lineSeparator());
        }

        System.out.print(builder);
    }
}

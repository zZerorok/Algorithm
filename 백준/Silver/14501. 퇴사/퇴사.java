import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        int[] Ti = new int[N + 1];
        int[] Pi = new int[N + 1];
        int[] dp = new int[N + 2];

        for (int i = 1; i <= N; i++) {
            String[] input = reader.readLine().split(" ");
            Ti[i] = Integer.parseInt(input[0]);
            Pi[i] = Integer.parseInt(input[1]);
        }

        for (int i = N; i >= 1; i--) {
            dp[i] = Math.max(dp[i], dp[i + 1]);

            if (i + Ti[i] <= N + 1) {
                dp[i] = Math.max(dp[i], Pi[i] + dp[i + Ti[i]]);
            }
        }

        System.out.println(dp[1]);
    }
}

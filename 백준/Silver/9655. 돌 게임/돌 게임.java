import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        if (n == 1) {
            System.out.println("SK");
            return;
        } 
        
        if (n == 2) {
            System.out.println("CY");
            return;
        }
        
        boolean[] dp = new boolean[n + 1];
        dp[1] = true;
        dp[2] = false;
        dp[3] = true;

        for (int i = 4; i <= n; i++) {
            dp[i] = !dp[i - 1] || !dp[i - 3];
        }

        System.out.println(dp[n] ? "SK" : "CY");
    }
}

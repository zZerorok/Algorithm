import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int[][] cost = new int[n][3];
        for (int i = 0; i < n; i++) {
            String[] split = reader.readLine().split(" ");

            cost[i][0] = Integer.parseInt(split[0]);
            cost[i][1] = Integer.parseInt(split[1]);
            cost[i][2] = Integer.parseInt(split[2]);
        }

        for (int i = 1; i < n; i++) {
            cost[i][0] += Math.min(cost[i - 1][1], cost[i - 1][2]);
            cost[i][1] += Math.min(cost[i - 1][0], cost[i - 1][2]);
            cost[i][2] += Math.min(cost[i - 1][0], cost[i - 1][1]);
        }

        int result = Math.min(Math.min(cost[n - 1][0], cost[n - 1][1]), cost[n - 1][2]);
        System.out.println(result);
        reader.close();
    }
}

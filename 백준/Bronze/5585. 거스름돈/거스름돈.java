import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int price = Integer.parseInt(reader.readLine());

        int[] coins = {500, 100, 50, 10, 5, 1};
        int change = 1000 - price;
        int count = 0;
        for (int coin : coins) {
            count += change / coin;
            change %= coin;
        }

        System.out.println(count);
    }
}

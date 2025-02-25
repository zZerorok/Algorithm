import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final Map<Integer, Ball> BASKET = new HashMap<>();

    public static void main(String[] args) throws IOException {
        String[] basketAndSwapInfo = READER.readLine().split(" ");
        int basketCount = Integer.parseInt(basketAndSwapInfo[0]);
        int swapCount = Integer.parseInt(basketAndSwapInfo[1]);

        for (int i = 1; i <= basketCount; i++) {
            BASKET.put(i, new Ball(i));
        }

        for (int i = 0; i < swapCount; i++) {
            String[] swapInput = READER.readLine().split(" ");
            int firstBasket = Integer.parseInt(swapInput[0]);
            int secondBasket = Integer.parseInt(swapInput[1]);

            Ball firstBall = BASKET.get(firstBasket);
            Ball secondBall = BASKET.get(secondBasket);

            BASKET.put(firstBasket, secondBall);
            BASKET.put(secondBasket, firstBall);
        }

        StringBuilder result = new StringBuilder();
        for (Ball ball : BASKET.values()) {
            result.append(ball.number).append(" ");
        }
        
        System.out.println(result.toString().trim());
    }

    static class Ball {
        private final int number;

        public Ball(int number) {
            this.number = number;
        }
    }
}

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String[] split = input.split(" ");
        int basketCount = Integer.parseInt(split[0]);
        int operationCount = Integer.parseInt(split[1]);

        Map<Integer, Basket> basketMap = new HashMap<>();
        for (int id = 1; id <= basketCount; id++) {
            basketMap.put(id, new Basket(id));
        }

        for (int i = 0; i < operationCount; i++) {
            String operation = reader.readLine();
            String[] partedOperation = operation.split(" ");
            int startBasketId = Integer.parseInt(partedOperation[0]);
            int endBasketId = Integer.parseInt(partedOperation[1]);
            int ballId = Integer.parseInt(partedOperation[2]);

            for (int j = startBasketId; j <= endBasketId; j++) {
                Basket basket = basketMap.get(j);
                Ball ball = new Ball(ballId);
                basket.putBall(ball);
            }
        }

        StringBuilder builder = new StringBuilder();
        for (Basket value : basketMap.values()) {
            Ball ball = value.ball;

            if (ball != null) {
                builder.append(ball.id).append(" ");
            } else {
                builder.append(0).append(" ");
            }
        }
        
        System.out.println(builder.toString().trim());
    }

    static class Basket {
        private int id;
        private Ball ball;

        public Basket(int id) {
            this.id = id;
        }

        public void putBall(Ball ball) {
            this.ball = ball;
        }
    }

    static class Ball {
        private final int id;

        public Ball(int id) {
            this.id = id;
        }
    }
}

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int moveCount = Integer.parseInt(reader.readLine());

        int ballPosition = 1;

        for (int i = 0; i < moveCount; i++) {
            String[] swapCups = reader.readLine().split(" ");
            int x = Integer.parseInt(swapCups[0]);
            int y = Integer.parseInt(swapCups[1]);

            if (ballPosition == x) {
                ballPosition = y;
            } else if (ballPosition == y) {
                ballPosition = x;
            }
        }

        System.out.println(ballPosition);
    }
}

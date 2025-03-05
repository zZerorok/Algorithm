import java.io.*;
import java.util.Stack;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final Stack<Integer> TOWERS = new Stack<>();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(READER.readLine());
        for (int i = 0; i < N; i++) {
            TOWERS.push(Integer.parseInt(READER.readLine()));
        }

        int count = 0;
        int temp = 0;
        while (!TOWERS.isEmpty()) {
            Integer tower = TOWERS.pop();
            if (tower > temp) {
                count += 1;
                temp = tower;
            }
        }

        System.out.println(count);
    }
}

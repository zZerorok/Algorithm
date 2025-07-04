import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());

        writer.write(String.valueOf(getQuadrant(x, y)));
        writer.flush();
    }

    private static int getQuadrant(int x, int y) {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else {
            return 4;
        }
    }
}

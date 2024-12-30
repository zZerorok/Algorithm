import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());

        int[][] apartments = new int[15][15];
        for (int i = 1; i < 15; i++) {
            apartments[0][i] = i;
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                apartments[i][j] = apartments[i - 1][j] + apartments[i][j - 1];
            }
        }

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(reader.readLine());
            int n = Integer.parseInt(reader.readLine());
            
            System.out.println(apartments[k][n]);
        }
        reader.close();
    }
}
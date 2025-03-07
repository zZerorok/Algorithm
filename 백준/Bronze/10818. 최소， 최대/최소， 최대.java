import java.io.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(READER.readLine());
        String[] values = READER.readLine().split(" ");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < count; i++) {
            int num = Integer.parseInt(values[i]);
            if (num < min) {
                min = num;
            }
            
            if (num > max) {
                max = num;
            }
        }
        
        System.out.println(min + " " + max);
    }
}

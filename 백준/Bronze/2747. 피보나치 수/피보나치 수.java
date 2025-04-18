import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        int num1 = 0;
        int num2 = 1;
        for (int i = 0; i < n; i++) {
            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }
        
        writer.write(String.valueOf(num1));
        writer.flush();
    }
}

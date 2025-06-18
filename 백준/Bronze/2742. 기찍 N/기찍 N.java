import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new java.io.OutputStreamWriter(System.out));
        int value = Integer.parseInt(reader.readLine());
        
        for (int i = value; i > 0 ; i--) {
            writer.write(String.valueOf(i));
            writer.newLine();
        }
        
        writer.flush();
    }
}

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String line = reader.readLine();
        writer.write(String.valueOf((int) line.charAt(0)));
        writer.flush();
    }
}

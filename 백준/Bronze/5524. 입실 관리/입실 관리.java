import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int entryCount = Integer.parseInt(reader.readLine());
        for (int i = 0; i < entryCount; i++) {
            String entryPersonName = reader.readLine();
            writer.write(entryPersonName.toLowerCase());
            writer.newLine();
        }
        
        writer.flush();
    }
}

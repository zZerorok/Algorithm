import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int buddhistEra  = Integer.parseInt(reader.readLine());
        writer.write(String.valueOf(buddhistEra - 543));
        writer.flush();
    }
}

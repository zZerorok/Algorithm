import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter WRITER = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final Map<String, String> SITE_PASSWORDS = new HashMap<>();

    public static void main(String[] args) throws IOException {
        String[] counts = READER.readLine().split(" ");
        int siteCount = Integer.parseInt(counts[0]);
        int searchPasswordCount = Integer.parseInt(counts[1]);

        for (int i = 0; i < siteCount; i++) {
            String[] sitePasswordPair = READER.readLine().split(" ");
            SITE_PASSWORDS.put(sitePasswordPair[0], sitePasswordPair[1]);
        }

        for (int i = 0; i < searchPasswordCount; i++) {
            String site = READER.readLine();
            String password = SITE_PASSWORDS.get(site);
            WRITER.write(password);
            WRITER.newLine();
        }

        WRITER.flush();
        WRITER.close();
        READER.close();
    }
}

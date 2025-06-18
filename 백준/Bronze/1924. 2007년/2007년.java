import java.io.*;
import java.time.LocalDate;

public class Main {
    
    public static final int TARGET_YEAR = 2007;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new java.io.OutputStreamWriter(System.out));

        String[] inputTokens = reader.readLine().split(" ");
        int month = Integer.parseInt(inputTokens[0]);
        int day = Integer.parseInt(inputTokens[1]);

        LocalDate date = LocalDate.of(TARGET_YEAR, month, day);
        String dayOfWeek = date.getDayOfWeek()
                .name()
                .substring(0, 3);
        
        writer.write(dayOfWeek);
        writer.flush();
    }
}

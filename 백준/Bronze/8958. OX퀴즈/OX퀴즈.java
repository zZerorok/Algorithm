import java.io.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter WRITER = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(READER.readLine());
        for (int i = 0; i < count; i++) {
            int totalScore = 0;
            int index = 0;
            String[] quizResult = READER.readLine().split("");

            for (String result : quizResult) {
                if (result.equals("O")) {
                    index += 1;
                    totalScore += index;
                } else if (result.equals("X")) {
                    index = 0;
                }
            }

            WRITER.write(String.valueOf(totalScore));
            WRITER.newLine();
        }
        
        WRITER.flush();
    }
}

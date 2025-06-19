import java.io.*;
import java.util.Map;

public class Main {

    private static final int TOTAL_SUBJECT = 20;
    private static final Map<String, Double> GRADE_INFO = Map.of(
            "A+", 4.5,
            "A0", 4.0,
            "B+", 3.5,
            "B0", 3.0,
            "C+", 2.5,
            "C0", 2.0,
            "D+", 1.5,
            "D0", 1.0,
            "F", 0.0
    );

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        double totalGradePoints = 0.0;
        double totalCredits = 0;
        for (int i = 0; i < TOTAL_SUBJECT; i++) {
            String[] tokens = reader.readLine().split(" ");
            double gradePoint = Double.parseDouble(tokens[1]);
            String grade = tokens[2];

            if (GRADE_INFO.containsKey(grade)) {
                totalCredits += gradePoint;
                totalGradePoints += gradePoint * GRADE_INFO.get(grade);
            }
        }

        double result = totalGradePoints / totalCredits;

        writer.write(String.format("%.6f", result));
        writer.flush();
    }
}

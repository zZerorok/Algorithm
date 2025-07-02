import java.io.*;
import java.util.*;

public class Main {

    private static final Map<String, Double> GRADE = new HashMap<>();

    static {
        GRADE.put("A+", 4.3);
        GRADE.put("A0", 4.0);
        GRADE.put("A-", 3.7);

        GRADE.put("B+", 3.3);
        GRADE.put("B0", 3.0);
        GRADE.put("B-", 2.7);

        GRADE.put("C+", 2.3);
        GRADE.put("C0", 2.0);
        GRADE.put("C-", 1.7);

        GRADE.put("D+", 1.3);
        GRADE.put("D0", 1.0);
        GRADE.put("D-", 0.7);

        GRADE.put("F", 0.0);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String gradeCode = reader.readLine();
        Double gradePoint = GRADE.get(gradeCode);

        writer.write(String.valueOf(gradePoint));
        writer.flush();
    }
}

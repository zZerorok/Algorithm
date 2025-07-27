import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int studentCount = Integer.parseInt(reader.readLine());
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            String name = tokenizer.nextToken();
            int korean = Integer.parseInt(tokenizer.nextToken());
            int english = Integer.parseInt(tokenizer.nextToken());
            int math = Integer.parseInt(tokenizer.nextToken());

            students.add(new Student(name, korean, english, math));
        }

        Collections.sort(students);

        for (Student student : students) {
            writer.write(student.name);
            writer.newLine();
        }

        writer.flush();
    }

    static class Student implements Comparable<Student> {
        final String name;
        final int korean;
        final int english;
        final int math;

        Student(String name, int korean, int english, int math) {
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }

        @Override
        public int compareTo(Student other) {
            if (this.korean != other.korean) {
                return other.korean - this.korean;
            }

            if (this.english != other.english) {
                return this.english - other.english;
            }

            if (this.math != other.math) {
                return other.math - this.math;
            }

            return this.name.compareTo(other.name);
        }
    }
}

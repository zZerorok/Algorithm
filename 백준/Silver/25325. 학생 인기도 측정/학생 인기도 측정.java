import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(reader.readLine());
        String[] names = reader.readLine().split(" ");

        Map<String, Integer> popularityMap = new HashMap<>();
        for (int i = 0; i < count; i++) {
            String[] studentNames = reader.readLine().split(" ");
            for (String name : studentNames) {
                popularityMap.put(name, popularityMap.getOrDefault(name, 0) + 1);
            }
        }

        List<Student> students = new ArrayList<>();
        for (String name : names) {
            int popularity = popularityMap.getOrDefault(name, 0);
            students.add(new Student(name, popularity));
        }

        Collections.sort(students);

        for (Student student : students) {
            writer.write(student.getName() + " " + student.getPopularity());
            writer.newLine();
        }

        writer.flush();
    }

    static class Student implements Comparable<Student> {
        private final String name;
        private final int popularity;

        public Student(String name, int popularity) {
            this.name = name;
            this.popularity = popularity;
        }

        public String getName() {
            return name;
        }

        public int getPopularity() {
            return popularity;
        }

        @Override
        public int compareTo(Student o) {
            if (this.popularity == o.popularity) {
                return this.name.compareTo(o.name);
            }
            return o.popularity - this.popularity;
        }
    }
}

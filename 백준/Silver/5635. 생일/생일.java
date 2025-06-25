import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Person> people = new ArrayList<>();

        int totalPeople = Integer.parseInt(reader.readLine());
        for (int i = 0; i < totalPeople; i++) {
            String[] personInfo = reader.readLine().split(" ");
            people.add(new Person(personInfo[0], getBirthday(personInfo)));
        }

        people.sort(Comparator.comparing(Person::getBirthday));

        writer.write(people.get(people.size() - 1).getName());
        writer.newLine();
        writer.write(people.get(0).getName());

        writer.flush();
    }

    private static LocalDate getBirthday(String[] personInfo) {
        return LocalDate.of(
                Integer.parseInt(personInfo[3]),
                Integer.parseInt(personInfo[2]),
                Integer.parseInt(personInfo[1])
        );
    }

    static class Person implements Comparable<Person> {

        private final String name;
        private final LocalDate birthday;

        public Person(String name, LocalDate birthday) {
            this.name = name;
            this.birthday = birthday;
        }

        public String getName() {
            return name;
        }

        public LocalDate getBirthday() {
            return birthday;
        }

        @Override
        public int compareTo(Person other) {
            return birthday.compareTo(other.birthday);
        }
    }
}

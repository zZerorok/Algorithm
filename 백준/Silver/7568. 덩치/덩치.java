import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter WRITER = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final List<Person> PEOPLE = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        int peopleCount = Integer.parseInt(READER.readLine());

        for (int i = 0; i < peopleCount; i++) {
            String[] input = READER.readLine().split(" ");
            Person person = new Person(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
            PEOPLE.add(person);
        }

        for (Person person : PEOPLE) {
            int rank = calculateRank(person);
            WRITER.write(rank + " ");
        }

        WRITER.flush();
        WRITER.close();
        READER.close();
    }

    private static int calculateRank(Person person) {
        int rank = 1;
        for (Person otherPerson : PEOPLE) {
            if (!person.equals(otherPerson) && otherPerson.isBigger(person)) {
                rank += 1;
            }
        }
        return rank;
    }

    static class Person {
        private final int weight;
        private final int height;

        public Person(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }

        public boolean isBigger(Person other) {
            return weight > other.weight && height > other.height;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return weight == person.weight && height == person.height;
        }

        @Override
        public int hashCode() {
            return Objects.hash(weight, height);
        }
    }
}

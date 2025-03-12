import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int memberCount = Integer.parseInt(reader.readLine());

        List<Member> members = new ArrayList<>();
        for (int i = 0; i < memberCount; i++) {
            String[] personInfo = reader.readLine().split(" ");
            int age = Integer.parseInt(personInfo[0]);
            String name = personInfo[1];
            members.add(new Member(age, name));
        }

        members.sort(Comparator.comparing(member -> member.age));

        StringBuilder result = new StringBuilder();
        for (Member member : members) {
            result.append(member.age)
                    .append(" ")
                    .append(member.name)
                    .append(System.lineSeparator());
        }

        System.out.println(result);
    }

    static class Member {
        private final int age;
        private final String name;

        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
}

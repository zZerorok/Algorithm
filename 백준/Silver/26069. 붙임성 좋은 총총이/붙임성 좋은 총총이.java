import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, Boolean> peopleMap = new HashMap<>();
        peopleMap.put("ChongChong", true);

        int peopleCount = Integer.parseInt(reader.readLine());
        for (int i = 0; i < peopleCount; i++) {
            String[] meetPeoples = reader.readLine().split(" ");
            String people1 = meetPeoples[0];
            String people2 = meetPeoples[1];
            if (peopleMap.getOrDefault(people1, false)) {
                peopleMap.put(people2, true);
            } else if (peopleMap.getOrDefault(people2, false)) {
                peopleMap.put(people1, true);
            }
        }

        int count = 0;
        for (Boolean value : peopleMap.values()) {
            if (value) {
                count += 1;
            }
        }

        writer.write(String.valueOf(count));
        writer.flush();
    }
}

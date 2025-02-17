import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int people = Integer.parseInt(reader.readLine());
        String[] split = reader.readLine().split(" ");

        List<Integer> withdrawTimes = new ArrayList<>();
        for (int i = 0; i < people; i++) {
            int withdrawTime = Integer.parseInt(split[i]);
            withdrawTimes.add(withdrawTime);
        }

        Collections.sort(withdrawTimes);

        int totalTime = 0;
        int currentSumTime = 0;
        for (Integer withdrawTime : withdrawTimes) {
            currentSumTime += withdrawTime;
            totalTime += currentSumTime;
        }

        System.out.println(totalTime);
    }
}

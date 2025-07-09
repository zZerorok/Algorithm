import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        int[] materials = new int[N];
        StringTokenizer st = new StringTokenizer(reader.readLine());

        for (int i = 0; i < N; i++) {
            materials[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(materials);

        int count = 0;
        int left = 0;
        int right = N - 1;

        while (left < right) {
            int sum = materials[left] + materials[right];

            if (sum == M) {
                count++;
                left++;
                right--;
            } else if (sum < M) {
                left++;
            } else {
                right--;
            }
        }

        writer.write(String.valueOf(count));
        writer.flush();
    }
}

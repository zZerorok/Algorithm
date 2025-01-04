import java.io.*;

public class Main {

    static int recursiveCount = 0;
    static int dynamicCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        recursive(n);
        dynamic(n);

        System.out.println(recursiveCount + " " + dynamicCount);
    }

    public static int recursive(int n) {
        if (n == 1 || n == 2) {
            recursiveCount++;
            return 1;
        } else {
            return (recursive(n - 1) + recursive(n - 2));
        }
    }

    public static int dynamic(int n) {
        int[] f = new int[n + 1];
        f[1] = f[2] = 1;
        for (int i = 3; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
            dynamicCount++;
        }
        return f[n];
    }
}

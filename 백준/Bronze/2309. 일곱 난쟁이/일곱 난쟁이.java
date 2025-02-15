
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int totalHeight = 0;
        int[] dwarfs = new int[9];
        for (int i = 0; i < 9; i++) {
            int height = Integer.parseInt(reader.readLine());
            dwarfs[i] = height;
            totalHeight += height;
        }

        Arrays.sort(dwarfs);

        int targetHeight = totalHeight - 100;
        boolean isFound = false;
        int exclude1 = 0;
        int exclude2 = 0;
        for (int i = 0; i < dwarfs.length; i++) {
            for (int j = i + 1; j < dwarfs.length; j++) {
                if ((dwarfs[i] + dwarfs[j]) == targetHeight) {
                    exclude1 = dwarfs[i];
                    exclude2 = dwarfs[j];
                    isFound = true;
                    break;
                }
            }
            
            if (isFound) {
                break;
            }
        }

        for (int dwarf : dwarfs) {
            if (dwarf != exclude1 && dwarf != exclude2) {
                System.out.println(dwarf);
            }
        }
    }
}
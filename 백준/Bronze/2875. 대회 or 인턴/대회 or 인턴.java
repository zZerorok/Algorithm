import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] split = reader.readLine().split(" ");
        int female = Integer.parseInt(split[0]);
        int male = Integer.parseInt(split[1]);
        int internship = Integer.parseInt(split[2]);
        
        int maxTeams = 0;
        while (true) {
            female -= 2;
            male -= 1;
            
            if (female < 0 || male < 0 || (female + male) < internship) {
                break;
            }

            maxTeams++;
        }
        System.out.println(maxTeams);
    }
}

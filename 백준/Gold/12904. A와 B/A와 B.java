import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String source = reader.readLine();
        String target = reader.readLine();

        String convertedTarget = convert(source, target);

        System.out.println(convertedTarget.equals(source) ? 1 : 0);
    }


    private static String convert(String source, String target) {
        StringBuilder targetBuilder = new StringBuilder(target);

        while (targetBuilder.length() > source.length()) {
            removeLastCharacter(targetBuilder);
        }

        return targetBuilder.toString();
    }

    private static void removeLastCharacter(StringBuilder target) {
        if (target.charAt(target.length() - 1) == 'A') {
            target.deleteCharAt(target.length() - 1);
        } else {
            target.deleteCharAt(target.length() - 1);
            target.reverse();
        }
    }
}

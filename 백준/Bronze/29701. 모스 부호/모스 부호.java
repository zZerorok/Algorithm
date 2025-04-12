import java.io.*;
import java.util.*;

public class Main {

    public static final Map<String, String> MORSE_CODE_MAP = new HashMap<>();

    static {
        MORSE_CODE_MAP.put(".-", "A");     MORSE_CODE_MAP.put("-...", "B");
        MORSE_CODE_MAP.put("-.-.", "C");   MORSE_CODE_MAP.put("-..", "D");
        MORSE_CODE_MAP.put(".", "E");      MORSE_CODE_MAP.put("..-.", "F");
        MORSE_CODE_MAP.put("--.", "G");    MORSE_CODE_MAP.put("....", "H");
        MORSE_CODE_MAP.put("..", "I");     MORSE_CODE_MAP.put(".---", "J");
        MORSE_CODE_MAP.put("-.-", "K");    MORSE_CODE_MAP.put(".-..", "L");
        MORSE_CODE_MAP.put("--", "M");     MORSE_CODE_MAP.put("-.", "N");
        MORSE_CODE_MAP.put("---", "O");    MORSE_CODE_MAP.put(".--.", "P");
        MORSE_CODE_MAP.put("--.-", "Q");   MORSE_CODE_MAP.put(".-.", "R");
        MORSE_CODE_MAP.put("...", "S");    MORSE_CODE_MAP.put("-", "T");
        MORSE_CODE_MAP.put("..-", "U");    MORSE_CODE_MAP.put("...-", "V");
        MORSE_CODE_MAP.put(".--", "W");    MORSE_CODE_MAP.put("-..-", "X");
        MORSE_CODE_MAP.put("-.--", "Y");   MORSE_CODE_MAP.put("--..", "Z");

        MORSE_CODE_MAP.put(".----", "1");  MORSE_CODE_MAP.put("..---", "2");
        MORSE_CODE_MAP.put("...--", "3");  MORSE_CODE_MAP.put("....-", "4");
        MORSE_CODE_MAP.put(".....", "5");  MORSE_CODE_MAP.put("-....", "6");
        MORSE_CODE_MAP.put("--...", "7");  MORSE_CODE_MAP.put("---..", "8");
        MORSE_CODE_MAP.put("----.", "9");  MORSE_CODE_MAP.put("-----", "0");

        MORSE_CODE_MAP.put("--..--", ","); MORSE_CODE_MAP.put(".-.-.-", ".");
        MORSE_CODE_MAP.put("..--..", "?"); MORSE_CODE_MAP.put("---...", ":");
        MORSE_CODE_MAP.put("-....-", "-"); MORSE_CODE_MAP.put(".--.-.", "@");
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int codeCount = Integer.parseInt(reader.readLine());
        String[] morseCodes = reader.readLine().split(" ");
        for (String morseCode : morseCodes) {
            if (MORSE_CODE_MAP.containsKey(morseCode)) {
                writer.write(MORSE_CODE_MAP.get(morseCode));
            }
        }
        writer.flush();
    }
}

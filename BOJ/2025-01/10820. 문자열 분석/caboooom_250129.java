import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        String line = null;
        while ((line = reader.readLine()) != null) {
            char[] input = line.toCharArray();
            int lowerCase = 0;
            int upperCase = 0;
            int digit = 0;
            int blank = 0;
            for (char c : input) {
                if (Character.isDigit(c)) {
                    ++digit;
                } else if (!Character.isLetter(c)) {
                    ++blank;
                } else if (Character.isLowerCase(c)) {
                    ++lowerCase;
                } else {
                    ++upperCase;
                }
            }
            builder.append(lowerCase).append(" ")
                    .append(upperCase).append(" ")
                    .append(digit).append(" ")
                    .append(blank).append("\n");

        }
        System.out.println(builder);

    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] input = reader.readLine().toCharArray();
        StringBuilder builder = new StringBuilder();
        char[] alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for (char c : input) {
            if (c == ' ' || Character.isDigit(c)) {
                builder.append(c);
            } else if (Character.isUpperCase(c)) {
                builder.append(Character.toUpperCase(alphabets[(c - 'A' + 13) % 26]));
            } else {
                builder.append(alphabets[(c - 'a' + 13) % 26]);
            }
        }
        System.out.println(builder);
    }
}

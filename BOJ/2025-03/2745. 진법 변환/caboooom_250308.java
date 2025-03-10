import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        String n = input[0];
        int b = Integer.parseInt(input[1]);

        int result = 0;
        int power = 1;

        for (int i = n.length() - 1; i >= 0; i--) {
            char c = n.charAt(i);

            int value;
            if (Character.isDigit(c)) {
                value = c - '0';
            } else {
                value = c - 'A' + 10;
            }

            result += value * power;
            power *= b;
        }

        System.out.println(result);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        StringBuilder builder = new StringBuilder();

        while (n > 0) {
            if (n % b < 10) {
                builder.append((char) (n % b + '0'));
            } else {
                builder.append((char) (n % b - 10 + 'A'));
            }
            n /= b;
        }

        System.out.println(builder.reverse());
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int testcase = Integer.parseInt(br.readLine());
        for (int t = 0; t < testcase; t++) {
            long sum = 0;
            String[] numbers = br.readLine().split(" ");
            int n = Integer.parseInt(numbers[0]);
            for (int i = 1; i < n; i++) {
                for (int j = i + 1; j < n + 1; j++) {
                    int a = Integer.parseInt(numbers[i]);
                    int b = Integer.parseInt(numbers[j]);

                    sum += gcd(a, b);
                }
            }
            builder.append(sum).append("\n");
        }
        System.out.println(builder);
    }

    static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return gcd(b, a % b);
        }
    }
}
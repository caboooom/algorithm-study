import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        long[][] dp = new long[201][201];
        for (int i = 1; i <= 200; i++) {
            for (int j = 1; j <= 200; j++) {
                dp[1][i] = 1;
                dp[i][1] = i;
            }
        }
        for (int i = 2; i <= 200; i++) {
            for (int j = 2; j <= 200; j++) {
                dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % 1_000_000_000;
            }
        }

        System.out.println(dp[k][n]);
    }
}

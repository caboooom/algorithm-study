import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());

            long[][] dp = new long[n+1][2];
            dp[1][1] = 1;

            for (int i = 2; i <= n; i++) {
                dp[i][0] = dp[i-1][0] + dp[i-1][1];
                dp[i][1] = dp[i-1][0];
            }

            System.out.println(dp[n][0] + dp[n][1]);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
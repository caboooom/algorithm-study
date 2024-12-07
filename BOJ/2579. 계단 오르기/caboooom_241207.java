import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());
            int[] stairs = new int[n];
            for (int i = 0; i < n; i++) {
                stairs[i] = Integer.parseInt(reader.readLine());
            }

            if (n == 1) {
                System.out.println(stairs[0]);
                return;
            }

            int[][] dp = new int[2][n];
            dp[1][0] = stairs[0];
            dp[0][1] = stairs[0] + stairs[1];
            dp[1][1] = stairs[1];
            for (int i = 2; i < n; i++) {
                dp[0][i] = stairs[i] + dp[1][i-1];
                dp[1][i] = stairs[i] + Math.max(dp[0][i-2], dp[1][i-2]);
            }
            System.out.println(Math.max(dp[0][n-1], dp[1][n-1]));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

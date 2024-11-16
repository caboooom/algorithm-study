import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * 소요 시간 : 1시간 12분
 */
public class Main {
    public static final int MOD = 10007;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] dp = new int[n+1][10];
        dp[0][0] = 1;

        for (int i=1; i<=n; i++) {
            dp[i][0] = 1;
            for (int j=1; j<dp[i].length; j++) {
                dp[i][j] =(dp[i-1][j] + dp[i][j-1]) % MOD;
            }
        }

        int sum = 0;
        for (int i=0; i<dp[n].length; i++) {
            sum += dp[n][i] % MOD;
        }

        System.out.println(sum % MOD);
        br.close();
    }
}
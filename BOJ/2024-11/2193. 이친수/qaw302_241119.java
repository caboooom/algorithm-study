import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * 소요 시간 : 20분
 */
public class Main
{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i=2; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        System.out.println(dp[n]);
        br.close();
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * 소요시간 : 1시간 10분 ( 풀이 참고 함 )
 */
public class Main
{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        int[] dp = new int[n+1];

        for(int i=1; i<=n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (i < 3) {
                dp[i] = arr[i] + arr[i-1];
            } else {
                dp[i] = Math.max(Math.max(dp[i-3] + arr[i-1]+arr[i], dp[i-2]+arr[i]), dp[i-1]);
            }
        }

        System.out.println(dp[n]);
        br.close();
    }
}
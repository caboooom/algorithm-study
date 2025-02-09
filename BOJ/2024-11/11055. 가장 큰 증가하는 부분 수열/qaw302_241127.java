import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * 소요시간 : 11분 (가장 긴 감소/증가하는 부분 수열 푼 직후에 품)
 */
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=1; i<=n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;
        int[] dp = new int[n+1];
        for (int i=1; i<=n; i++) {
            dp[i] = A[i];
            for (int j=1; j<i; j++) {
                if (A[j] < A[i] && dp[j]+A[i] > dp[i]) {
                    dp[i] = dp[j]+A[i];
                }
            }
            if (result < dp[i]) {
                result = dp[i];
            }
        }
        
        System.out.println(result);
        br.close();
    }
}
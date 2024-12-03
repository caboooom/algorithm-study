import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

/**
 * 소요 시간 : 9분 (11722 가장 긴 감소하는 부분 수열을 풀고 난 직후 바로 품)
 */
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[n];
        dp[0] = 1;
        int result = 1;
        for (int i=1; i<n; i++) {
            dp[i] = 1;
            for (int j=0; j<i; j++) {
                if (A[j] < A[i] && dp[j]+1 > dp[i] ) {
                    dp[i] = dp[j]+1;
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
package BOJ.DP.합분해_2225.insub2004_241219;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
참고 : https://www.youtube.com/watch?v=8mFiz8pNZOw
 */
public class Main {
    static final int MOD = 1_000_000_000;
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   // 목표수, 최대 정수
        int K = Integer.parseInt(st.nextToken());   // 자릿수

        long[][] dp = new long[K+1][N+1];
        Arrays.fill(dp[1],1);
        for (int i = 2; i <= K; i++) {
            dp[i][0] = 1;
        }

        for (int i = 2; i <= K; i++) {
            for (int j = 1; j <= N; j++) {
                dp[i][j] = dp[i][j-1] % MOD + dp[i-1][j] % MOD;
            }
        }

        System.out.println(dp[K][N] % MOD);
    }

}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * 소요 시간 : 1시간 18분 (정답 참고 함)
 */
public class Main
{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n+1][10];

        for (int i=1; i<dp[1].length; i++) {
            dp[1][i] = 1;
        }
        
        for (int i=2; i<=n; i++) {
            dp[i][0] = dp[i-1][1];
            dp[i][9] = dp[i-1][8];
            for (int j=1; j<9; j++) {
                dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % 1000000000;
            }
        }

        long sum = 0;
        for (int i=0; i<=9; i++) {
            sum += dp[n][i];
        }
        

        System.out.println(sum%1000000000);
        br.close();



        /** 아래는 다른 사람 코드를 보고 수정한 코드
         * - 모듈러 연산할 때 나누는 값을 변수로 지정해둠
         * - sum의 타입을 long에서 int로 변경 후 MOD로 모듈러 연산
         */ 
        // int MOD = 1000000000;
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int n = Integer.parseInt(br.readLine());
        // int[][] dp = new int[n+1][10];

        // for (int i=1; i<dp[1].length; i++) {
        //     dp[1][i] = 1;
        // }
        
        // for (int i=2; i<=n; i++) {
        //     dp[i][0] = dp[i-1][1];
        //     dp[i][9] = dp[i-1][8];
        //     for (int j=1; j<9; j++) {
        //         dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % MOD;
        //     }
        // }

        // int sum = 0;
        // for (int i=0; i<=9; i++) {
        //     sum += dp[n][i] % MOD;
        // }
        

        // System.out.println(sum%MOD);
        // br.close();
        
    }
}
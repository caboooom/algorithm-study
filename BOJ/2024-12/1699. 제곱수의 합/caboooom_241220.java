import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int[] dp = new int[n + 1];

        if (n <= 3) {
            System.out.println(n);
            return;
        }

        for (int i = 1; i <= 3; i++) {
            dp[i] = i;
        }

        for (int i = 4; i <= n; i++) {

            // 만약 i가 제곱수라면, 1을 저장
            if (Math.sqrt(i) % (int)Math.sqrt(i) == 0) {
                dp[i] = 1;
                continue;
            }

            // 그렇지 않다면, 제곱수들의 최소합 조합 중 최소값을 저장
            int minNumber = Integer.MAX_VALUE;
            int j = 1;
            int k = i-1;
            while (j < k) {
                minNumber = Math.min(minNumber, dp[j] + dp[k]);
                ++j;
                --k;
            }
            if (j == k) {
                minNumber = Math.min(minNumber, dp[j] * 2);
            }
            dp[i] = minNumber;
        }

        System.out.println(dp[n]);
    }
}

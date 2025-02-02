import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://yabmoons.tistory.com/536
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        if (n % 2 == 1) {
            System.out.println(0);
            return;
        }

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 0;
        dp[2] = 3;
        for (int i = 4; i <= n; i = i + 2) {
            dp[i] = dp[2] * dp[i - 2];
            for (int j = i - 4; j >= 0; j = j - 2) {
                dp[i] += dp[j] * 2;
            }
        }

        System.out.println(dp[n]);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[1] = 0;

        int cursor = 1;
        while (cursor <= n) {
            int currentCount = dp[cursor];
            if (cursor * 2 <= n) {
                dp[cursor * 2] = Math.min(currentCount + 1, dp[cursor * 2]);
            }
            if (cursor * 3 <= n) {
                dp[cursor * 3] = Math.min(currentCount + 1, dp[cursor * 3]);
            }
            if (cursor + 1 <= n) {
                dp[cursor + 1] = Math.min(currentCount + 1, dp[cursor + 1]);
            }
            ++cursor;
        }

        System.out.println(dp[n]);
    }
}
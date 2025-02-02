import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int[] arr;
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            arr = new int[N + 1];
            dp = new Integer[N + 1];
            String[] strArr = br.readLine().split(" ");
            arr[0] = 0;
            dp[0] = 0;
            dp[1] = 1;

            for (int i = 1; i <= N; i++) {
                arr[i] = Integer.parseInt(strArr[i - 1]);
            }
            for (int i = 1; i <= N; i++) {
                recur(i);
            }
            int max = dp[0];

            for (int i = 1; i <= N; i++) {
                max = Math.max(max, dp[i]);
            }
            System.out.println(max);
        }
    }

    private static int recur(int n) {
        if (dp[n] == null) {
            dp[n] = 1;
            for (int i = n - 1; i >= 0; i--) {
                if (arr[n] > arr[i]) {
                    dp[n] = Math.max(dp[n], recur(i) + 1);
                }
            }
        }
        return dp[n];
    }
}

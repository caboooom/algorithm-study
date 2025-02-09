import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static Integer[] arr;
    private static Integer[] dp;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            String[] tempArr = br.readLine().split(" ");
            arr = new Integer[N + 1];
            dp = new Integer[N + 1];

            arr[0] = 0;
            dp[0] = 0;

            for (int i = 1; i <= N; i++) {
                arr[i] = Integer.parseInt(tempArr[i - 1]);
            }
            for (int i = 1; i <= N; i++) {
                recur(i);
            }
            int max = Integer.MIN_VALUE;
            for (int i = 1; i <= N; i++) {
                max = Math.max(max, dp[i]);
            }
            System.out.println(max);
        }
    }

    private static int recur(int n) {
        if (dp[n] == null) {
            dp[n] = Math.max(arr[n], recur(n - 1) + arr[n]);
        }
        return dp[n];
    }
}

import java.io.*;

public class Main {
    static Integer[] dp;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            int N = Integer.parseInt(br.readLine());
            dp = new Integer[N + 1];
            arr = new int[N + 1];
            String[] strArr = br.readLine().split(" ");
            for (int i = 1; i <= N; i++) {
                arr[i] = Integer.parseInt(strArr[i - 1]);
            }

            arr[0] = 0;
            dp[0] = 0;
            dp[1] = arr[1];

            for (int i = 1; i <= N; i++) {
                recur(i);
            }
            int max = dp[0];
            for (int i : dp) {
                max = Math.max(max, i);
            }

            System.out.println(max);
        }

    }

    private static int recur(int n) {
        if (dp[n] == null) {
            dp[n] = 1;

            for (int i = n - 1; i >= 0; i--) {
                if (arr[n] > arr[i]) {
                    dp[n] = Math.max(dp[n], recur(i) + arr[n]);
                }
            }
        }
        return dp[n];
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] arr;
    static Integer[] dp;
    static Integer[] ldp;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            arr = new int[N + 1];
            dp = new Integer[N + 1];
            ldp = new Integer[N + 1];
            String[] tempArr = br.readLine().split(" ");
            dp[0] = 0;
            dp[1] = 1;
            ldp[0] = 0;
            ldp[N] = 1;

            for (int i = 0; i < N; i++) {
                arr[i + 1] = Integer.parseInt(tempArr[i]);
            }
            for (int i = 1; i <= N; i++) {
                rRecur(i);
            }
            for (int i = N; i >= 0; i--) {
                lRecur(i);
            }
            int max = 1;
            for (int i = 1; i <= N; i++) {
                dp[i] = dp[i] + ldp[i] - 1;
                max = Math.max(max, dp[i]);
            }
            System.out.println(max);
        }
    }

    private static int rRecur(int n) {
        if (dp[n] == null) {
            dp[n] = 1;

            for (int i = n - 1; i >= 0; i--) {
                if (arr[i] < arr[n]) {
                    dp[n] = Math.max(dp[n], rRecur(i) + 1);
                }
            }
        }
        return dp[n];
    }

    private static int lRecur(int n) {
        if (ldp[n] == null) {
            ldp[n] = 1;

            for (int i = n + 1; i < ldp.length; i++) {
                if (arr[i] < arr[n]) {
                    ldp[n] = Math.max(ldp[n], lRecur(i) + 1);
                }
            }
        }

        return ldp[n];
    }
}

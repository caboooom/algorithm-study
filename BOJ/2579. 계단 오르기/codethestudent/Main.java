import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Integer[] arr;
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            arr = new Integer[N + 1];
            dp = new Integer[N + 1];
            arr[0] = 0;
            dp[0] = 0;

            for (int i = 0; i < N; i++) {
                arr[i + 1] = Integer.parseInt(br.readLine());
            }
            dp[1] = arr[1];
            
            if (N >= 2) {
                dp[2] = dp[1] + arr[2];
            }

            System.out.println(recur(N));
        }
    }

    private static int recur(int n) {
        if (dp[n] == null) {
            dp[n] = Math.max(recur(n - 2), recur(n - 3) + arr[n - 1]) + arr[n];
        }
        return dp[n];
    }
}

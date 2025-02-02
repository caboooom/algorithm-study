import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            dp = new Integer[N + 1];
            dp[0] = 1;

            if (N % 2 != 0) {
                System.out.println(0);
            } else {
                System.out.println(recur(N));
            }
        }
    }

    private static int recur(int n) {
        if (dp[n] == null) {
            dp[n] = recur(n - 2) * 3;
            for (int i = 4; i <= n; i += 2) {
                dp[n] += recur(n - i) * 2;
            }
        }
        return dp[n];
    }
}
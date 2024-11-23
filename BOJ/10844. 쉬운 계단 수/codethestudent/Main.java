import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Long[][] dp;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            dp = new Long[N + 1][10];

            for (int i = 0; i < 10; i++) {
                dp[1][i] = 1L;
            }

            long result = 0;

            for (int i = 1; i <= 9; i++) {
                result += recur(N, i);
            }
            // for (Long[] d : dp) {
            //     System.out.println(Arrays.toString(d));
            // }
            System.out.println(result % 1000000000);
        }
    }

    private static long recur(int level, int val) {
        if (level == 1) {
            return dp[level][val];
        }

        if (dp[level][val] == null) {
            if (val == 0) {
                dp[level][val] = recur(level - 1, val + 1);
            } else if (val == 9) {
                dp[level][val] = recur(level - 1, val - 1);
            } else {
                dp[level][val] = (recur(level - 1, val - 1) + recur(level - 1, val + 1)) % 1000000000;
            }
        }
        return dp[level][val] % 1000000000;
    }
}

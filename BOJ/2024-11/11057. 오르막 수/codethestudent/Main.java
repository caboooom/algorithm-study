import java.io.*;

public class Main {
    private static int[][] dp;

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            dp = new int[N + 1][11];
            for (int i = 0; i < 10; i++) {
                dp[1][i] = 10 - i;
            }
            if (N > 1) {
                for (int i = 2; i <= N; i++) {
                    for (int j = 9; j >= 0; j--) {
                        dp[i][j] = (dp[i - 1][j] + dp[i][j + 1]) % 10007;
                    }
                }
            }
            System.out.println(dp[N][0] % 10007);
        } catch (IOException e) {

        }
    }
}

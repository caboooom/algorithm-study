import java.io.*;

public class Main {
    static int[] cardPack;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            String[] temp = br.readLine().split(" ");

            cardPack = new int[N + 1];
            dp = new int[N + 1];

            for (int i = 1; i <= N; i++) {
                cardPack[i] = Integer.parseInt(temp[i - 1]);
            }

            dp[0] = Integer.MIN_VALUE;
            dp[1] = cardPack[1];
            System.out.println(recur(N));

        }
    }

    private static int recur(int n) {
        if (dp[n] == 0) {
            dp[n] = cardPack[n];
            for (int i = 1; i <= n/2; i++) {
                dp[n] = Math.max(recur(n - i) + recur(i), dp[n]);
            }
        }
        return dp[n];
    }

}

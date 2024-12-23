import java.io.*;

public class Main {
    static Integer[][] dp;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input = br.readLine().split(" ");
            int goal = Integer.parseInt(input[0]);
            int count = Integer.parseInt(input[1]);
            dp = new Integer[201][201];
            for (int i = 0; i < 201; i++) {
                dp[0][i] = 1;
                dp[i][0] = 0;
            }
            dp[1][1] = 1;
            System.out.println(recur(goal, count));
        }
    }

    private static int recur(int n, int k) {
        if (dp[n][k] == null) {
            dp[n][k] = (recur(n - 1, k) + recur(n, k - 1)) % 1000000000;
        }
        return dp[n][k];
    }
}

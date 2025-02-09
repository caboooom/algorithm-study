import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(reader.readLine());

            for (int t = 0; t < T; t++) {
                int n = Integer.parseInt(reader.readLine());
                int[][] dp = new int[3][n + 1];
                for (int i = 0; i < 2; i++) {
                    String[] line = reader.readLine().split(" ");
                    for (int j = 0; j < line.length; j++) {
                        dp[i+1][j+1] = Integer.parseInt(line[j]);
                    }
                }
                for (int i = 2; i <= n; i++) {
                    dp[0][i] = Math.max(dp[1][i-1], dp[2][i-1]);
                    dp[1][i] += Math.max(dp[0][i-1], dp[2][i-1]);
                    dp[2][i] += Math.max(dp[0][i-1], dp[1][i-1]);
                }
                System.out.println(Math.max(dp[1][n], dp[2][n]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

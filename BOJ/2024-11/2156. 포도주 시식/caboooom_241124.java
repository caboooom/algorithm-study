import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());
            int[] wines = new int[n];
            for (int i = 0; i < n; i++) {
                wines[i] = Integer.parseInt(reader.readLine());
            }
            if (n <= 2) {
                System.out.println(Arrays.stream(wines).sum());
                return;
            }

            int[] dp = new int[n];
            dp[0] = wines[0];
            dp[1] = wines[0] + wines[1];
            dp[2] = Math.max(dp[1], Math.max(wines[0] + wines[2], wines[1] + wines[2]));

            for (int i = 3; i < n; i++) {
                dp[i] = Math.max(dp[i-1], Math.max(wines[i] + dp[i-2], wines[i] + wines[i-1] + dp[i-3]));
            }

            System.out.println(dp[n-1]);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

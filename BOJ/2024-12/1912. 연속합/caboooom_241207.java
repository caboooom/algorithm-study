import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int[] arr = new int[n];
            int[] dp = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(tokenizer.nextToken());
            }

            int answer = arr[0];
            dp[0] = arr[0];
            for (int i = 1; i < n; i++) {
                dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);
                answer = Math.max(answer, dp[i]);
            }
            System.out.println(answer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

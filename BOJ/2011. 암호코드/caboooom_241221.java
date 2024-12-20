import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://gyong0117.tistory.com/105
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] dp = new int[5001];
        String input = reader.readLine();
        if (input.charAt(0) == '0') {
            System.out.println(0);
            return;
        }
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 1; i <= input.length(); i++) {
            if (input.charAt(i - 1) != '0') {
                dp[i] = dp[i - 1] % 1_000_000;
            }
            if (i > 1) {
                int tmp = (input.charAt(i - 2) - '0') * 10 + (input.charAt(i - 1) - '0');
                if (tmp >= 10 && tmp <= 26) {
                    dp[i] = (dp[i] + dp[i - 2]) % 1_000_000;
                }
            }
        }
        System.out.println(dp[input.length()]);
    }
}

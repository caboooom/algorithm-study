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
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(tokenizer.nextToken());
            }
            int[] dp = new int[n];

            int answer = 1;
            for (int i = 0; i < n; i++) {
                dp[i] = 1;
                int increaseMaxLength = 0;
                for (int j = i; j >= 0; j--) {
                    if (arr[i] < arr[j]) {
                        dp[j] = 0;
                    } else {
                        for (int k = i; k > j; k--) {
                            if (arr[k] > arr[j] && dp[k] + 1 > dp[j]) {
                                dp[j] = dp[k] + 1;
                                increaseMaxLength = Math.max(increaseMaxLength, dp[j]);
                            }
                        }
                    }
                }

                for (int j = i; j < n; j++) {
                    dp[j] = 0;
                }
                dp[i] = 1;
                int decreaseMaxLength = 0;
                for (int j = i+1; j < n; j++) {
                    if (arr[i] < arr[j]) {
                        dp[j] = 0;
                    } else {
                        for (int k = i; k < j; k++) {
                            if (arr[k] > arr[j] && dp[k]+1 > dp[j]) {
                                dp[j] = dp[k] + 1;
                                decreaseMaxLength = Math.max(decreaseMaxLength, dp[j]);
                            }
                        }
                    }
                }
                if (increaseMaxLength == 0 || decreaseMaxLength == 0) {
                    answer = Math.max(answer, increaseMaxLength + decreaseMaxLength);
                } else {
                    answer = Math.max(answer, increaseMaxLength + decreaseMaxLength - 1);
                }
            }

            System.out.println(answer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

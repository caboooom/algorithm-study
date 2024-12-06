import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            //  입력 받기
            int n = Integer.parseInt(reader.readLine());
            String[] sarr = reader.readLine().split(" ");
            int[] dp = new int[n];
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(sarr[i]);
            }

            dp[0] = arr[0]; // 부분 수열의 시작점 dp 값을 배열의 시작 숫자로 초기화
            for (int i = 1; i < n; i++) {
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[i] > arr[j] && dp[i] < dp[j] + arr[i]) {
                        dp[i] = dp[j] + arr[i];
                    }
                }
                if (dp[i] == 0) { // 만약 현재 숫자가 부분 수열의 시작점이 되어야 한다면, dp값을 현재 숫자로 초기화
                    dp[i] = arr[i];
                }
            }

            // dp 배열에서 가장 큰 값 출력
            int answer = 0;
            for (int i = 0; i < n; i++) {
                answer = Math.max(answer, dp[i]);
            }
            System.out.println(answer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] dp;

    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        dp = new int[100001];

        for (int i = 1; i <= n; i++) {
            dp[i] = i;
        }

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j * j <= i; j++) {
                if (dp[i] > dp[i - (j * j)] + 1) { 
                    dp[i] = dp[i - (j * j)] + 1;
                }
            }
        }

        System.out.println(dp[n]);
    }
}
// 제곱으로 표현할수 있는 덧셈 항 갯수, 제일 큰 수로 제곱먼저하고 작은 수를 차례대로 제곱하여 더하는건,, 안됨
// 18 처럼 3으로 제곱하는게 더 작은 경우가 있음...

// 10 = 3*3 + 1*1
// 11 = 3*3 + 1*1 + 1*1
// 12 = 3*3 + 1*1 + 1*1 + 1*1
// 13 = 3*3 + 2*2
// 14 = 3*3 + 2*2 + 1*1
// 15 = 3*3 + 2*2 + 1*1 + 1*1
// 16 = 4*4
// 17 = 4*4 + 1*1
// 18 = 3*3 + 3*3
// 19 = 3*3 + 3*3 + 1*1
// 20 = 4*4 + 2*2
// 21 = 4*4 + 2*2 + 1*1

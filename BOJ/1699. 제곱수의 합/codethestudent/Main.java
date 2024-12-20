import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.BufferedReader;

public class Main {
    static Integer[] dp;

    public static void main(String args[]) throws NumberFormatException, IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            dp = new Integer[N + 1];
            Arrays.fill(dp, Integer.MAX_VALUE);
            dp[0] = 0;

            for (int i = 1; i * i <= N; i++) {
                int square = i * i;
                for (int j = square; j <= N; j++) {
                    dp[j] = Math.min(dp[j - square] + 1, dp[j]);
                }
            }

            System.out.println(dp[N]);
        }
    }
}
// 제곱으로 표현할수 있는 덧셈 항 갯수, 제일 큰 수로 제곱먼저하고 작은 수를 차례대로 제곱하여 더하는건,, 안됨
// 18 처럼 3으로 제곱하는게 더 작은 경우가 있음... 가우스 그거 생각하면 풀림 근데 시간초과 뜸... 최대한 반복수를 줄이면서 제곱수에
// 1씩 더해가며 배열 수정해야 할거 같음
// dp[1] = 1 = 1;
// dp[2] = 1 + 1 = 2;
// dp[3] = 1 + 1 + 1 = 3;
// dp[4] = 2 = 1;
// dp[5] = 2 + 1 = 2;
// dp[6] = 2 + 1 + 1 = 3;
// dp[7] = 2 + 1 + 1 + 1 = 4;
// dp[8] = 2 + 2 = 2;
// dp[9] = 3 = 1;
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

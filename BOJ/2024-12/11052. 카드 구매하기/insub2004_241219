package BOJ.DP.카드구매하기_11052.insub2004_241219;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
참고 : https://www.youtube.com/watch?v=zHnM0R5at8s
 */
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] dt = new int[N+1];    // 카드팩 가격
        int[] dp = new int[N+1];    // 장당 max값

        String[] strings = br.readLine().split(" ");
        for (int i = 0; i < strings.length; i++) {
            dt[i+1] = Integer.parseInt(strings[i]);
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] = Math.max(dp[i-j] + dt[j], dp[i]);
            }
        }

        System.out.println(dp[N]);
    }

}

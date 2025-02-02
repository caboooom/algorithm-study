package BOJ.DP.연속합_1952.insub2004_241206;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        // 입력 배열 초기화
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 동적 계획법 배열 (현재까지의 최대 연속합을 저장)
        int[] dp = new int[N];

        // 첫 번째 원소로 초기화
        dp[0] = arr[0];
        int maxSum = arr[0];

        // 동적 계획법으로 최대 연속합 계산
        for (int i = 1; i < N; i++) {
            // 이전 연속합 + 현재 원소 vs 현재 원소 중 최대값 선택
            dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);

            // 전체 최대합 갱신
            maxSum = Math.max(maxSum, dp[i]);
        }

        // 최대 연속합 출력
        System.out.println(maxSum);
    }
}
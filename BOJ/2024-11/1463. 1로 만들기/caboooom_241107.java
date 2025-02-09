import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        // 인풋 입력받기
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        // dp 테이블 초기화
        // 1부터 각 인덱스에 해당하는 숫자를 만들기 위한 최소 연산 횟수를 저장할 테이블이다.
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[1] = 0;

        // cursor = 1 부터 시작하여
        // cursor*2, cursor*3, cursor+1을 만들기 위한 최소 연산 횟수를 계산하여 저장한다.
        // 현재 계산한 값이 기존 값보다 작으면, 기존 값을 현재 계산한 값으로 업데이트한다.
        int cursor = 1;
        while (cursor <= n) {
            int currentCount = dp[cursor];
            if (cursor * 2 <= n) {
                dp[cursor * 2] = Math.min(currentCount + 1, dp[cursor * 2]);
            }
            if (cursor * 3 <= n) {
                dp[cursor * 3] = Math.min(currentCount + 1, dp[cursor * 3]);
            }
            if (cursor + 1 <= n) {
                dp[cursor + 1] = Math.min(currentCount + 1, dp[cursor + 1]);
            }
            ++cursor;
        }

        // 결과 출력
        System.out.println(dp[n]);
    }
}
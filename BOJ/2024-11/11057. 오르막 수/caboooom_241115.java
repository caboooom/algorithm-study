import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());

            // 배열 초기화
            int[][] board = new int[n+1][10];
            for (int i = 0; i < 10; i++) {
                board[1][i] = 1;
            }
            for (int i = 0; i <= n; i++) {
                board[i][0] = 1;
            }

            // 배열 채우기
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j < 10; j++) {
                    board[i][j] = (board[i-1][j] + board[i][j-1]) % 10_007;
                }
            }

            // 정답 계산, 출력
            int answer = 0;
            for(int i = 0; i < 10; i++) {
                answer += board[n][i];
                answer %= 10_007;
            }
            System.out.println(answer);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

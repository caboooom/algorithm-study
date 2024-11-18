import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());

            int[][] board = new int[n+1][10];
            for(int i = 1; i < 10; i++) {
                board[1][i] = 1;
            }

            for(int i = 2; i < n+1; i++) {
                board[i][0] = board[i-1][1] % 1_000_000_000;
                board[i][9] = board[i-1][8] % 1_000_000_000;
                for(int j = 1; j < 9; j++) {
                    board[i][j] = (board[i-1][j-1] + board[i-1][j+1]) % 1_000_000_000;
                }
            }

            int answer = 0;
            for(int i = 0; i < 10; i++) {
                answer = (answer + board[n][i]) % 1_000_000_000;
            }
            System.out.println(answer);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
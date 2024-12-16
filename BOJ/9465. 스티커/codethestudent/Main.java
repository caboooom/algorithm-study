import java.io.*;
import java.util.*;

public class Main {
    static long[][] dp;
    static long[][] stickers;

    public static void main(String[] args) throws IOException {
        List<Long> answer = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int N = Integer.parseInt(br.readLine());

            for (int i = 0; i < N; i++) {
                int columns = Integer.parseInt(br.readLine());

                dp = new long[2][columns + 1];
                stickers = new long[2][columns + 1];
                String[] rows1 = br.readLine().split(" ");
                String[] rows2 = br.readLine().split(" ");
                for (int j = 1; j <= columns; j++) {
                    stickers[0][j] = Long.parseLong(rows1[j - 1]);
                    stickers[1][j] = Long.parseLong(rows2[j - 1]);
                }

                dp[0][1] = stickers[0][1];
                dp[1][1] = stickers[1][1];

                for (int j = 2; j <= columns; j++) {
                    dp[0][j] = Math.max(dp[1][j - 1], dp[1][j - 2]) + stickers[0][j];
                    dp[1][j] = Math.max(dp[0][j - 1], dp[0][j - 2]) + stickers[1][j];
                }

                answer.add(Math.max(dp[0][columns], dp[1][columns]));
            }

            for (int i = 0; i < N; i++) {
                System.out.println(answer.get(i));
            }
        }
    }
}

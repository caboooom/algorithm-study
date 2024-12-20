import java.io.*;
import java.util.Arrays;

public class Main {
    static int[] cardPack;
    // static double[] unitPrice;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            String[] temp = br.readLine().split(" ");

            cardPack = new int[N + 1];
            // unitPrice = new double[N + 1];
            dp = new int[N + 1];

            for (int i = 1; i <= N; i++) {
                cardPack[i] = Integer.parseInt(temp[i - 1]);
                // unitPrice[i] = cardPack[i] / i;
            }
            System.out.println(Arrays.toString(cardPack));

            for (int i = 1; i < N; i++) {
                for (int j = 1; j <= i; j++) {
                    dp[i] = Math.max(dp[i], dp[i - j] + cardPack[j]);
                }
            }

            System.out.println(Arrays.toString(dp));
        }
    }

}

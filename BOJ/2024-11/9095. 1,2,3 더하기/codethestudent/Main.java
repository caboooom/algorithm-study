import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static Integer[] dp;
    static List<Integer> answerList;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            answerList = new ArrayList<>();
            dp = new Integer[11];

            for (int i = 1; i <= N; i++) {
                int n = Integer.parseInt(br.readLine());
                dp[0] = 0;
                dp[1] = 1;
                if (n >= 2) {
                    dp[2] = 2;
                    dp[3] = 4;
                }
                answerList.add(getPosibility(n));
            }
            for (Integer answer : answerList) {
                System.out.println(answer);
            }
        }
    }

    private static int getPosibility(int n) {
        if (dp[n] == null) {
            dp[n] = getPosibility(n - 1) + getPosibility(n - 2) + getPosibility(n - 3);

        }
        return dp[n];
    }
}

// 3
// 4 1111, 112, 121, 211, 22, 13, 31
// 7 1111111, 1111112,
// 10

// 7
// 44
// 274
import java.io.*;

public class Main {
    static Integer[] dp;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] codes = br.readLine().split("");

            dp = new Integer[codes.length + 1];
            arr = new int[codes.length + 1];

            for (int i = 0; i < codes.length; i++) {
                arr[i + 1] = Integer.parseInt(codes[i]);
            }

            if (arr[1] == 0) {
                System.out.println(0);
                return;
            }

            arr[0] = 0;
            dp[0] = dp[1] = 1;
            System.out.println(recur(codes.length));
        }
    }

    private static int recur(int n) {
        if (dp[n] == null) {
            dp[n] = 0;
            if (arr[n] <= 9 && arr[n] >= 1) {
                dp[n] = (dp[n] + recur(n - 1)) % 1000000;
            }
            int tenthNumber = arr[n - 1] * 10 + arr[n];
            if (tenthNumber < 27 && tenthNumber >= 10) {
                dp[n] = (dp[n] + recur(n - 2)) % 1000000;
            }
        }
        return dp[n];
    }
}

// a1 b2 c3 d4 e5 f6 g7 h8 i9 j10 k11 l12 m13 n14 o15 p16 q17 r18 x19 t20 u21
// v22 w23 x24 y25 z26
// b2 e5 a1 n14
// 이건.. 규칙을 찾는게 쉽지 않았음. 1의 자리 수가 1-9사이면 n-1번째 값을 가져오고, 10의 자리 수가 10-26사이이면 n-2 번째 값을 또 더해줌.
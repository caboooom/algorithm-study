import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[] w;
	static Integer[] dp;

	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int N = Integer.parseInt(br.readLine());
			w = new int[N + 1];
			dp = new Integer[N + 1];

			for (int i = 1; i <= N; i++) {
				w[i] = Integer.parseInt(br.readLine());
			}

			dp[0] = 0;
			dp[1] = w[1];
			if (N > 1) {
				dp[2] = dp[1] + w[2];
			}

			System.out.println(recur(N));
		}
	}

	private static int recur(int n) {
		if (dp[n] == null) {
			dp[n] = Math.max(Math.max(recur(n - 1), w[n] + recur(n - 2)), recur(n - 3) + w[n - 1] + w[n]);
		}

		return dp[n];
	}

}

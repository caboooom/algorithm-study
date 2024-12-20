import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class Main {
	static Long[] dp;
	static List<Long> answerList = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int total = Integer.parseInt(br.readLine());
			dp = new Long[101];
			dp[0] = 0l;
			dp[1] = 1l;
			dp[2] = 1l;

			for (int i = 0; i < total; i++) {
				int N = Integer.parseInt(br.readLine());

				if (N < 3) {
					answerList.add(1l);
				} else {
					answerList.add(recur(N));
				}
			}
			for (long a : answerList) {
				System.out.println(a);
			}
		}
	}

	private static long recur(int n) {
		if (dp[n] == null) {
			dp[n] = recur(n - 3) + recur(n - 2);
		}
		return dp[n];
	}
}
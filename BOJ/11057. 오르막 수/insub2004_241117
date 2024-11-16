package BOJ.DP.오르막수_11057.insub2004_241117;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    private static final int MOD = 10_007;
    private static int[][] array = new int[10][1001];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < 10; i++) {
            array[i][1] = 1;
        }

        for (int i = 2; i <= N; i++) {  // 열
            array[9][i] = array[9][i-1];
            for (int j = 0; j < 9; j++) {   // 행 -> 0행은 전 열의 1~9행의 합 + 1, 1행은 전 열의 2~9행의 합 + 1
                int sum = 0;
                for (int k= j; k<10; k++) {  // 이전 열의 합들
                    sum = (sum + array[k][i-1]) % MOD;
                }
                array[j][i] = sum % MOD;
            }
        }

        int answer = 0;

        for (int i = 0; i < 10; i++) {
            answer = (answer + array[i][N]) % MOD;
        }

        System.out.println(answer);
    }
}

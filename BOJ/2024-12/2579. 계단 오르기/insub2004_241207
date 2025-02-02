package BOJ.DP.계단오르기_2579.insub2004_241204;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] stairs = new int[N+1];

        for (int i = 1; i < stairs.length; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }

        int[][] countStairs = new int[N+1][3];
        countStairs[1] = new int[]{0,stairs[1],0};

        for (int i = 2; i < countStairs.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (j==0) {
                    countStairs[i][j] = Math.max(countStairs[i-1][1], countStairs[i-1][2]);
                } else if (j==1) {
                    countStairs[i][j] = countStairs[i-1][0] + stairs[i];
                } else if (j==2) {
                    countStairs[i][j] = countStairs[i-1][1] + stairs[i];
                }
            }
        }

        System.out.println(Math.max(countStairs[N][1],countStairs[N][2]));
        br.close();
    }
}

package BOJ.DP.이곱하기n타일링2_11727.insub2004_241110;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] array = new int[n+1];
        array[1] = 1;
        if (n > 1) {
            array[2] = 3;   // (ArrayIndexOutOfBounds)
        }

        for (int i = 3; i <= n; i++) {  // n까지 반복
            array[i] = (array[i-1] + array[i-2]*2) % 10007;
        }

        System.out.println(array[n]);
    }
}

package BOJ.DP.이곱하기n타일링_11726.insub2004_241110;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    // 점화식
    // 규칙이 있었다.
    // d(n) = d(n-2) + d(n-1)

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] array = new int[n+1];
        array[1] = 1;
        if (n > 1) {
            array[2] = 2;  // n이 1보다 클 때만 array[2] 초기화 (ArrayIndexOutOfBounds)
        }

        for (int i = 3; i <= n; i++) {
            array[i] = (array[i-2] + array[i-1]) % 10007;   // int형의 최대 범위를 벗어날 수 있기 때문에 마지막에 모듈러 연산을 하는게 아니라
        }                                                   // 매 단계마다 모듈러 연산을 해줘야한다.

        System.out.println(array[n]);

    }
}

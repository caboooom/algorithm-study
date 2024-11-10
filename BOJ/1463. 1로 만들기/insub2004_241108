package BOJ.DP.일로만들기_1463.insub2004_241108;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    private static int[] array = new int[1000003];

    public static void main(String[] args) throws Exception {
        array[2] = 1;
        array[3] = 1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        for (int i = 4; i < array.length; i++) {
            int a = Integer.MAX_VALUE;  // 만약, i를 3으로 나눌 수 있는경우 -> 3으로 나눈 값을 저장할 변수
            int b = Integer.MAX_VALUE;  // 만약, i를 2으로 나눌 수 있는경우 -> 2으로 나눈 값을 저장할 변수
            int c = Integer.MAX_VALUE;  // i에서 1을 뺀 값을 저장할 변수

            if (i % 3 == 0) {
                a = array[i / 3];       // array[i/3]에는 n(i)을 1로 만들때의 최솟값이 있음
            }
            if (i % 2 == 0) {
                b = array[i / 2];       // array[i/2]에는 n(i)을 1로 만들때의 최솟값이 있음
            }
            c = array[i - 1];           // array[i-1]에는 n(i)을 1로 만들때의 최솟값이 있음

            array[i] = Math.min(a,Math.min(b,c)) + 1;
        }

        System.out.println(array[input]);

    }

}

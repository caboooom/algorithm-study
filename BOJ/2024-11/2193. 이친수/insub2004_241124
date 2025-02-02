package BOJ.DP.이친수_2193.insub2004_241124;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int parsedInt = Integer.parseInt(br.readLine());
        if (parsedInt == 1) {
            System.out.println(1);
            return;
        }

        long[][] array = new long[parsedInt+1][2];
        array[1] = new long[]{0, 1};
        array[2] = new long[]{1, 0};

        for (int i = 3; i < array.length; i++) {
            array[i][0] = array[i-1][0] + array[i-1][1];
            array[i][1] = array[i-1][0];
        }

        System.out.println(array[parsedInt][0] + array[parsedInt][1]);
    }
}

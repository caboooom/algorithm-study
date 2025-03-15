import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");
        int cnt = str.length;
        int zeroCnt = cnt % 3 == 0? 0 : 3-cnt%3;
        int[] nums = new int[cnt + zeroCnt];
        for (int i=0; i<cnt; i++) {
            nums[i+zeroCnt] = Integer.parseInt(str[i]);
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        int cursor = nums.length - 1;
        while (cursor > 0) {
            int sum = 0;
            for (int i=0; i<3; i++) {
                sum += nums[cursor--] * (int) Math.pow(2, i);
            }
            sb.insert(0, sum);
        }
        
        System.out.println(sb);
    }
}
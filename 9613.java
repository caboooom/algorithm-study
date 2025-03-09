import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int i=0; i<t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] nums = new int[Integer.parseInt(st.nextToken())];
            for (int j=0; j<nums.length; j++) {
                nums[j] = Integer.parseInt(st.nextToken());
            }
            sb.append(gcdSum(nums)).append("\n");
        }
        br.close();
        System.out.print(sb);
    }

    public static int gcd(int a, int b) {
        if (b==0){return a;}
        return gcd(b, a%b);
    }

    public static long gcdSum(int[] nums) {
        long sum=0;
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                int gcd = gcd(nums[i], nums[j]);
                sum += gcd;
            }
        }

        return sum;
    }
}

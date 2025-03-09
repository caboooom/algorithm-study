import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        System.out.println(BTo10(B, N, 0));
    }

    public static long BTo10(int B, String N, int index) {
        if (N.length() == index) {return 0;}
        char num = N.charAt(N.length() - index - 1);
        if (num >= 65) {
            num -= 55;
        } else {
            num -= 48;    // 아스키의 0~9는 48~57
        }
        return  (long)(num * Math.pow(B, index++)) + BTo10(B,N,index);
    }
}
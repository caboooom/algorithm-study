import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        int gcd = gcd(a, b);
        sb.append(gcd)
        .append("\n")
        .append(lcm(a, b, gcd));

        System.out.println(sb);
    }

    private static int gcd(int a, int b) {
        if (b==0) {
            return a;
        }
        return gcd(b, a%b);
    }

    private static int lcm(int a, int b, int gcd) {
        return a * b / gcd;
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * 풀이소요시간 : 1시간 5분 (1시간지난 후 검색)
 */
public class Main
{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] cnts = new int[n+1];
        cnts[0] = 1;
        cnts[1] = 1;

        for (int i=2; i<=n; i++) {
            cnts[i] = (cnts[i-1] + cnts[i-2]*2) % 10007;
        }

        br.close();
        System.out.println(cnts[n]);
    }
}
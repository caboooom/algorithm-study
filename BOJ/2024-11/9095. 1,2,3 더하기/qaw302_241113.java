import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * 소요시간 : 44분
 */
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int i=0; i<t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] cnts = new int[n+1];
            cnts[0] = 1;
            cnts[1] = 1;

            if (n > 1) {
                cnts[2] = 2;
            }
            for (int j=3; j<=n; j++) {
                cnts[j] = cnts[j-1] + cnts[j-2] + cnts[j-3];
            }
            sb.append(cnts[n]);
            sb.append("\n");
        }

        br.close();
        System.out.print(sb.toString());
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * 풀이소요시간 : 40분
 */
public class Main
{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] cnts = new int[n+1];

        // 피보나치 연산을 사용함
        cnts[0] = 1;
        cnts[1] = 1;
        for (int i=2; i<=n; i++) {
            cnts[i] = (cnts[i-1] + cnts[i-2]) % 10007;    // 처음에 출력하는 부분에서만 해주니 틀렸는데 질문 게시판보니 1000일때 값이 넘어가서 저장할때마다 해주어야한다고 함
        }

        br.close();
        System.out.println(cnts[n]);
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * 풀이소요시간 : 49분
 */
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] mem = new int[n+1];

        int i = 2;
        while (i <= n) {

            if (i==2 || i==3) {
                mem[i] = 1;
            } else {
                mem[i] = mem[i-1] + 1;

                if (i%2 == 0 && (mem[i] == 0 || mem[i] > mem[i/2])) {
                    mem[i] = mem[i/2] + 1;
                }
                if (i%3 == 0 && (mem[i] == 0 || mem[i] > mem[i/3])) {
                    mem[i] = mem[i/3] + 1;
                }
            }

            i++;
        }

        br.close();

        System.out.println(mem[n]);
    }
}


// 아래는 제출 후 수정해본 코드 (검색해보니 Math.min을 사용하길래 더 간단한것같아서 바꿔봤음. 코드 실행시간은 동일)
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] mem = new int[n+1];

        for (int i=2; i <= n; i++) {
            if (i==2 || i==3) {
                mem[i] = 1;
            } else {
                mem[i] = mem[i-1] + 1;

                if (i%2 == 0) {
                    mem[i] = Math.min(mem[i], mem[i/2] + 1);
                }
                if (i%3 == 0) {
                    mem[i] = Math.min(mem[i], mem[i/3] + 1);
                }
            }
        }

        br.close();
        System.out.println(mem[n]);
    }
}
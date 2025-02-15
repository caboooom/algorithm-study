import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int sec = 0;
        int cnt = 0;
        while(N > 0) {
            cnt++;
            if (cnt > N) {
                cnt=1;
            }

            N -= cnt;
            sec++;

        }

        System.out.println(sec);
        br.close();
    }
}


// 위는 최종 제출 코드 아래는 처음에 제출한 코드

/*
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int sec = 0;
        int cnt = 0;
        while(N > 0) {
            sec++;
            cnt++;

            if (cnt > N) {
                cnt=1;
            }
            for (int i=0; i<cnt; i++) {
                N--;
            }
        }

        System.out.println(sec);
        br.close();
    }
}
*/
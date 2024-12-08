package BOJ.DP.가장긴바이토닉부분수열_11054.insub2004_241208;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        // 입력 배열 초기화
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 증가하는 부분 수열의 길이
        int[] increase = new int[N];
        // 감소하는 부분 수열의 길이
        int[] decrease = new int[N];

        // 왼쪽에서 오른쪽으로 증가하는 부분 수열 길이 계산
        for (int i = 0; i < N; i++) {
            increase[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && increase[i] < increase[j] + 1) {
                    increase[i] = increase[j] + 1;
                }
            }
        }

        // 오른쪽에서 왼쪽으로 감소하는 부분 수열 길이 계산
        for (int i = N - 1; i >= 0; i--) {
            decrease[i] = 1;
            for (int j = N - 1; j > i; j--) {
                if (arr[i] > arr[j] && decrease[i] < decrease[j] + 1) {
                    decrease[i] = decrease[j] + 1;
                }
            }
        }

        // 최대 바이토닉 부분 수열 길이 계산
        int maxLength = 0;
        for (int i = 0; i < N; i++) {
            // 각 지점을 기준으로 증가하는 부분 + 감소하는 부분 - 1
            // (-1은 중복된 지점을 제외하기 위함)
            maxLength = Math.max(maxLength, increase[i] + decrease[i] - 1);
        }

        System.out.println(maxLength);
    }
}
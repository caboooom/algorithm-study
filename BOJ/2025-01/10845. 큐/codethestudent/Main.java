import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static int[] arr;
    private static List<Integer> list = new ArrayList<>();
    private static int first;
    private static int last;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            arr = new int[N + 1];
            first = 0;
            last = 0;

            for (int i = 0; i < N; i++) {
                command(br.readLine());
            }
            for (int result : list) {
                System.out.println(result);
            }
        }
    }

    private static void command(String s) {
        String[] commandArr = s.split(" ");

        if ("push".equals(commandArr[0])) {
            arr[last++] = Integer.parseInt(commandArr[1]);

        } else if ("pop".equals(commandArr[0])) {
            if (first == last) { // 빈 큐 확인
                list.add(-1);
            } else {
                list.add(arr[first]);
                arr[first] = 0; // 배열 초기화 (선택 사항)
                first++;
            }

        } else if ("front".equals(commandArr[0])) {
            if (first == last) {
                list.add(-1);
            } else {
                list.add(arr[first]);
            }

        } else if ("back".equals(commandArr[0])) {
            if (first == last) {
                list.add(-1);
            } else {
                list.add(arr[last - 1]); // 마지막 요소는 last - 1
            }

        } else if ("size".equals(commandArr[0])) {
            list.add(last - first); // 큐의 크기

        } else if ("empty".equals(commandArr[0])) {
            list.add(first == last ? 1 : 0); // 큐가 비었는지 확인
        }
    }
}

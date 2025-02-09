import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static Map<Long, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            long N = Long.parseLong(br.readLine());
            for (int i = 0; i < N; i++) {
                Long n = Long.parseLong(br.readLine()); // 여기서 매우 큰 수 가 들어오면 파싱이 되지 않음
                if (!map.containsKey(n)) {
                    map.put(n, 1);
                } else {
                    map.put(n, map.get(n) + 1);
                }
            }
            long maxKey = 0;
            int max = 0;
            for (Map.Entry<Long, Integer> s : map.entrySet()) {
                if (s.getValue() > max) {
                    max = s.getValue();
                    maxKey = s.getKey();
                } else if (s.getValue() == max && s.getKey() < maxKey) {
                    maxKey = s.getKey();
                }
            }

            System.out.println(maxKey);
        }
    }
}

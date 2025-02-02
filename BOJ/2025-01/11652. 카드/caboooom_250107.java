import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        Map<Long, Integer> counts = new HashMap<>();
        int maxCount = 0;
        long answer = 0;
        for (int i = 0; i < n; i++) {
            Long number = Long.parseLong(reader.readLine());
            counts.put(number, counts.getOrDefault(number, 0) + 1);
            if (counts.get(number) == maxCount) {
                if (answer > number) {
                    answer = number;
                }
            } else if (counts.get(number) > maxCount) {
                maxCount = counts.get(number);
                answer = number;
            }
        }
        System.out.println(answer);
    }
}
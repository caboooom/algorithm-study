import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] arr = br.readLine().split(" ");

            int n = Integer.parseInt(arr[0]);
            int k = Integer.parseInt(arr[1]);

            Queue<Integer> queue = new LinkedList<>();
            List<Integer> answer = new ArrayList<>();

            for (int i = 1; i <= n; i++) {
                queue.add(i);
            }

            int count = 1;

            while (!queue.isEmpty()) {
                if (count++ == k) {
                    count = 1;
                    answer.add(queue.poll());
                } else {
                    queue.add(queue.poll());
                }
            }
            StringBuilder sb = new StringBuilder("<");
            sb.append(answer.stream().map(e -> String.valueOf(e)).collect(Collectors.joining(", ")))
                    .append(">");
            System.out.println(sb.toString());
        }
    }
}

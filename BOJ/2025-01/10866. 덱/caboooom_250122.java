import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        Deque<Integer> deque = new ArrayDeque<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String[] line = reader.readLine().split(" ");
            switch (line[0]) {
                case "push_front":
                    deque.addFirst(Integer.parseInt(line[1]));
                    break;
                case "push_back":
                    deque.addLast(Integer.parseInt(line[1]));
                    break;
                case "pop_front":
                    if (deque.isEmpty()) {
                        builder.append(-1).append("\n");
                    } else {
                        builder.append(deque.removeFirst()).append("\n");
                    }
                    break;
                case "pop_back":
                    if (deque.isEmpty()) {
                        builder.append(-1).append("\n");
                    } else {
                        builder.append(deque.removeLast()).append("\n");
                    }
                    break;
                case "size":
                    builder.append(deque.size()).append("\n");
                    break;
                case "empty":
                    if (deque.isEmpty()) {
                        builder.append(1).append("\n");
                    } else {
                        builder.append(0).append("\n");
                    }
                    break;
                case "front":
                    if (deque.isEmpty()) {
                        builder.append(-1).append("\n");
                    } else {
                        builder.append(deque.getFirst()).append("\n");
                    }
                    break;
                case "back":
                    if (deque.isEmpty()) {
                        builder.append(-1).append("\n");
                    } else {
                        builder.append(deque.getLast()).append("\n");
                    }
                    break;
            }
        }
        System.out.println(builder);
    }
}

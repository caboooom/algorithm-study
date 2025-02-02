import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Deque<Integer> queue = new LinkedList<>();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String[] line = reader.readLine().split(" ");
            switch (line[0]) {
                case "push" :
                    queue.addLast(Integer.parseInt(line[1]));
                    break;
                case "pop" :
                    if (queue.isEmpty()) {
                        builder.append(-1).append("\n");
                    } else {
                        builder.append(queue.removeFirst()).append("\n");
                    }
                    break;
                case "size" :
                    builder.append(queue.size()).append("\n");
                    break;
                case "empty" :
                    if (queue.isEmpty()) {
                        builder.append(1).append("\n");
                    } else {
                        builder.append(0).append("\n");
                    }
                    break;
                case "front" :
                    if (queue.isEmpty()) {
                        builder.append(-1).append("\n");
                    } else {
                        builder.append(queue.getFirst()).append("\n");
                    }
                    break;
                case "back" :
                    if (queue.isEmpty()) {
                        builder.append(-1).append("\n");
                    } else {
                        builder.append(queue.getLast()).append("\n");
                    }
                    break;
            }
        }
        System.out.println(builder);
    }
}

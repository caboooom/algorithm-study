import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char[] input = reader.readLine().toCharArray();
            String result = getResult(input);
            answer.append(result).append("\n");
        }
        System.out.println(answer);
    }

    public static String getResult(char[] input) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : input) {
            if (c ==  '(') {
                stack.push('(');
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                if (stack.pop() != '(') {
                    return "NO";
                }
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }
}

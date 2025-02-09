import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    private static List<String> answerList = new ArrayList<>();
    private static Stack<String> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());

            for (int i = 0; i < N; i++) {
                vpsCheck(br.readLine());
                stack.removeAllElements();
            }

            for (String answer : answerList) {
                System.out.println(answer);
            }
        }
    }

    private static void vpsCheck(String s) {
        String[] arr = s.split("");

        for (String element : arr) {
            if (element.equals("(")) {
                stack.push(element);
            } else if (stack.isEmpty() && element.equals(")")) {
                answerList.add("NO");
                return;
            } else {
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            answerList.add("YES");
        } else {
            answerList.add("NO");
        }
    }
}

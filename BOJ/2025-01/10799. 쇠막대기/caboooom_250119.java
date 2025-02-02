import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] input = reader.readLine().toCharArray();

        Deque<Integer> stack = new LinkedList<>();
        int total = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (input[i - 1] == '(') {
                    total += stack.size();
                } else {
                    total += 1;
                }
            }
        }
        System.out.println(total);
    }
}
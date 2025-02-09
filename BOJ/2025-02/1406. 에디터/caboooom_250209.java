import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        Stack<Character> originalStack = new Stack<>();
        for(int i = 0; i < input.length(); i++) {
            originalStack.push(input.charAt(i));
        }
        int m = Integer.parseInt(reader.readLine());

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < m; i++) {
            String line = reader.readLine();
            char cmd = line.charAt(0);
            if(cmd == 'L') {
                if(!originalStack.isEmpty()) {
                    stack.push(originalStack.pop());
                }
            }else if(cmd == 'D') {
                if(!stack.isEmpty()) {
                    originalStack.push(stack.pop());
                }
            }else if(cmd == 'B') {
                if(!originalStack.isEmpty()) {
                    originalStack.pop();
                }
            }else {
                originalStack.push(line.charAt(2));
            }
        }

        while(!stack.isEmpty()) {
            originalStack.push(stack.pop());
        }

        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < originalStack.size(); i++) {
            builder.append(originalStack.get(i));
        }
        System.out.println(builder);
    }
}
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static int[] arr;
    static int index = 0;
    static List<Integer> result = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            arr = new int[N];
            for (int i = 0; i < N; i++) {
                String[] command = br.readLine().split(" ");
                runCommand(command);
            }

            for (int i : result) {
                System.out.println(i);
            }
        }
    }

    private static void runCommand(String[] command) {
        if (command.length > 1) {
            if (command[0].equals("push")) {
                arr[index++] = Integer.parseInt(command[1]);
            }
        } else {
            parseCommand(command[0]);
        }
    }

    private static void parseCommand(String cmd) {
        if (cmd.equals("top")) {
            if (index <= 0) {
                result.add(-1);
            } else {
                result.add(arr[index - 1]);
            }
        } else if (cmd.equals("size")) {
            result.add(index);
        } else if (cmd.equals("pop")) {
            if (index <= 0) {
                result.add(-1);
            } else {
                result.add(arr[index - 1]);
                arr[--index] = 0;
            }
        } else if (cmd.equals("empty")) {
            result.add(index == 0 ? 1 : 0);
        }
    }
}

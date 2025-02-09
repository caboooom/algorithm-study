import java.io.*;
import java.util.*;

class Main {
    static Deque<String> lstack = new ArrayDeque<>();
    static Deque<String> rstack = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] text = br.readLine().split("");
            for (String t : text) {
                lstack.push(t);
            }
            int count = Integer.parseInt(br.readLine());

            for (int i = 0; i < count; i++) {
                String[] cmd = br.readLine().split(" ");
                if ("L".equals(cmd[0]) && !lstack.isEmpty()) {
                    String temp = lstack.pop();
                    rstack.push(temp);
                } else if ("D".equals(cmd[0]) && !rstack.isEmpty()) {
                    String temp = rstack.pop();
                    lstack.push(temp);
                } else if ("B".equals(cmd[0]) && !lstack.isEmpty()) {
                    lstack.pop();
                } else if ("P".equals(cmd[0])) {
                    lstack.push(cmd[1]);
                }
            }

            print();
        }
    }

    private static void print() throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            Deque<String> resultQ = new ArrayDeque<>();
            for (String t : lstack) {
                resultQ.push(t);
            }
            for (String t : resultQ) {
                bw.write(t);
            }
            for (String t : rstack) {
                bw.write(t);
            }
            bw.flush();
        }
    }
}
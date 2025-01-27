import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static Node front;
    static Node back;
    static int size;
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            size = 0;
            front = new Node(null, null, 0);
            back = front;

            for (int i = 0; i < N; i++) {
                processCmd(br.readLine());
            }
            for (int i : list) {
                System.out.println(i);
            }
        }
    }

    private static void processCmd(String s) {
        String[] cmdParts = s.split(" ");

        if (cmdParts.length > 1) {
            push(cmdParts);
        } else if ("front".equals(cmdParts[0])) {
            list.add(size == 0 ? -1 : front.value);
        } else if ("back".equals(cmdParts[0])) {
            list.add(size == 0 ? -1 : back.value);
        } else if ("size".equals(cmdParts[0])) {
            list.add(size);
        } else if ("empty".equals(cmdParts[0])) {
            list.add(size == 0 ? 1 : 0);
        } else if ("pop_front".equals(cmdParts[0])) {
            if (size == 0) {
                list.add(-1);
                return;
            }
            list.add(front.value);
            front = front.next;
            if (front == null) {
                size--;
                return;
            }
            front.prev = null;
            size--;
        } else if ("pop_back".equals(cmdParts[0])) {
            if (size == 0) {
                list.add(-1);
                return;
            }
            list.add(back.value);
            back = back.prev;
            if (back == null) {
                size--;
                return;
            }
            back.next = null;
            size--;
        }
    }

    private static void push(String[] s) {
        if (size == 0) {
            Node node = new Node(null, null, Integer.parseInt(s[1]));
            front = node;
            back = node;
            size++;
            return;
        }
        if ("push_front".equals(s[0])) {
            Node node = new Node(null, front, Integer.parseInt(s[1]));
            front.prev = node;
            front = node;
        } else {
            Node node = new Node(back, null, Integer.parseInt(s[1]));
            back.next = node;
            back = node;
        }
        size++;
    }

    public static class Node {
        Node prev;
        Node next;
        int value;

        public Node(Node prev, Node next, int value) {
            this.prev = prev;
            this.next = next;
            this.value = value;
        }
    }
}
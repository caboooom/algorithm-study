package BOJ.자료구조.큐_10845.insub2004_241110;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    private static class MyQueue {
        int[] array = new int[10001];
        int top = 0;
        int head = -1;
        int size = 0;

        public void push(int x) {
            array[++head] = x;
            size++;
        }

        public int pop() {
            if (size == 0) {
                return -1;
            }

            size--;
            return array[top++];
        }

        public int size() {
            return size;
        }

        public int empty() {
            return size == 0 ? 1 : 0;
        }

        public int front() {
            if (size == 0) {
                return -1;
            }

            return array[top];
        }

        public int back() {
            if (size == 0) {
                return -1;
            }

            return array[head];
        }
    }

    public static void main(String[] args) throws Exception {
        MyQueue queue = new MyQueue();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            if (str.length == 2) {
                queue.push(Integer.parseInt(str[1]));
            }

            switch (str[0]) {
                case "pop" :
                    System.out.println(queue.pop());
                    break;
                case "size" :
                    System.out.println(queue.size);
                    break;
                case "empty" :
                    System.out.println(queue.empty());
                    break;
                case "front" :
                    System.out.println(queue.front());
                    break;
                case "back" :
                    System.out.println(queue.back());
                    break;
            }
        }

    }
}

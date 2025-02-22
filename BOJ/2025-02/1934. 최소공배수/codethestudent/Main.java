import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                String[] arr = br.readLine().split(" ");
                result.add(lcm(Integer.parseInt(arr[0]), Integer.parseInt(arr[1])));
            }

            for (Integer a : result) {
                System.out.println(a);
            }
        }
    }

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
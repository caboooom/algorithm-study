import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] inputs = br.readLine().split(" ");

            long A = Long.parseLong(inputs[0]);
            long B = Long.parseLong(inputs[1]);

            long result = gcd(A, B);

            StringBuilder stringA = new StringBuilder();
            for (int i = 0; i < result; i++) {
                stringA.append("1");
            }

            System.out.println(stringA);
        }
    }

    private static long gcd(long A, long B) {
        while (B != 0) {
            long temp = B;
            B = A % B;
            A = temp;
        }
        return A;
    }
}
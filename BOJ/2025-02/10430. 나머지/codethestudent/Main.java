import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] arr = br.readLine().split(" ");

            Integer A = Integer.parseInt(arr[0]);
            Integer B = Integer.parseInt(arr[1]);
            Integer C = Integer.parseInt(arr[2]);

            System.out.println((A + B) % C);
            System.out.println(((A % C) + (B % C)) % C);
            System.out.println((A * B) % C);
            System.out.println(((A % C) * (B % C)) % C);
        }
    }
}

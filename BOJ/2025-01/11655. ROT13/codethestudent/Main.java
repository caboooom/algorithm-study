import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// abcdefghijklm nopqrstuvwyxz
public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line = br.readLine();
            StringBuilder sb = new StringBuilder();

            for (char c : line.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    if (c >= 'n') {
                        sb.append((char) (c - 13));
                    } else {
                        sb.append((char) (c + 13));
                    }
                } else if (c >= 'A' && c <= 'Z') {
                    if (c >= 'N') {
                        sb.append((char) (c - 13));
                    } else {
                        sb.append((char) (c + 13));
                    }
                } else {
                    sb.append(c);
                }
            }

            System.out.println(sb.toString());
        }
    }
}

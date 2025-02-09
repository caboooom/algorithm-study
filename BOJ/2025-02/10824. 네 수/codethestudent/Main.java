import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] line = br.readLine().split(" ");

            long ab = Long.parseLong(line[0] + line[1]);
            long cd = Long.parseLong(line[2] + line[3]);
            
            System.out.println(ab + cd);
        }
    }
}

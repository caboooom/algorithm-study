import java.io.*;
import java.util.*;

public class Main {
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line = br.readLine();

            for (int i = 0; i < line.length(); i++) {
                list.add(line.substring(i, line.length()));
            }

            Collections.sort(list);
            for (String l : list) {
                System.out.println(l);
            }
        }
    }
}

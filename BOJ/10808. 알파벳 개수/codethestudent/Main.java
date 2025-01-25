import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static Map<Character, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            for (char i = 'a'; i <= 'z'; i++) {
                map.put(i, 0);
            }
            char[] word = br.readLine().toCharArray();

            for (char c : word) {
                map.put(c, map.get(c) + 1);
            }

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                System.out.print(entry.getValue() + " ");
            }
        }
    }

}

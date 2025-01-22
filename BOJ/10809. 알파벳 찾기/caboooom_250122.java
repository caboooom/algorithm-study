import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));;
        char[] input = reader.readLine().toCharArray();
        int[] alphabets = new int[26];
        Arrays.fill(alphabets, -1);
        for (int i = 0; i < input.length; i++) {
            char c = input[i];
            if (alphabets[c - 'a'] < 0) {
                alphabets[c - 'a'] = i;
            }
        }
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < alphabets.length; i++) {
            answer.append(alphabets[i]).append(" ");
        }
        System.out.println(answer);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        List<String> lst = new ArrayList<>(input.length());
        for (int i = 0; i < input.length(); i++) {
            lst.add(input.substring(i, input.length()));
        }
        Collections.sort(lst);
        StringBuilder builder = new StringBuilder();
        lst.stream().forEach(s->builder.append(s).append("\n"));
        System.out.println(builder);
    }
}
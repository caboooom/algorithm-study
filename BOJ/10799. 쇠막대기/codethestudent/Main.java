import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int nextAdd;
    private static int totalSticks;
    private static String previousElement;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] arr = br.readLine().split("");
            nextAdd = 0;
            totalSticks = 0;
            boolean flag = true;

            for (String element : arr) {
                if (flag) {
                    previousElement = element;
                    flag = false;
                }
                if (element.equals("(")) {
                    ++nextAdd;
                } else if (previousElement.equals("(") && element.equals(")")) {
                    --nextAdd;
                    totalSticks += nextAdd;
                } else {
                    --nextAdd;
                    ++totalSticks;
                }
                previousElement = element;
            }

            System.out.println(totalSticks);
        }
    }
}

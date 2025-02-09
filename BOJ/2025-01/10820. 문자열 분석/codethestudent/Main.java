import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 소문자, 대문자, 숫자, 공백
// a = 97, A = 65
public class Main {
    static List<Integer[]> answerList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
                Integer[] element = new Integer[4];

                int space = 0;
                int small = 0;
                int big = 0;
                int num = 0;

                for (char c : line.toCharArray()) {
                        if (c >= 97) {
                            small++;
                        } else if (c >= 65 && c < 97) {
                            big++;
                        } else if(c == ' '){
                            space++;
                        } else {
                            num++;
                        }
                }

                element[0] = small;
                element[1] = big;
                element[2] = num;
                element[3] = space;
                answerList.add(element);
            }

            for (Integer[] a : answerList) {
                for (Integer b : a) {
                    System.out.print(b + " ");
                }
                System.out.println();
            }
        }
    }
}

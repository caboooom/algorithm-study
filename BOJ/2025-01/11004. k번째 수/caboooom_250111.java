// 첫번째 제출
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//import java.util.stream.Collectors;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
//        tokenizer.nextToken();
//        int k = Integer.parseInt(tokenizer.nextToken());
//
//        System.out.println(
//                Arrays.stream(reader.readLine().split(" "))
//                        .map(Integer::parseInt)
//                        .sorted()
//                        .collect(Collectors.toCollection(ArrayList::new))
//                        .get(k - 1)
//        );
//    }
//}

// 두번째 제출
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());

        tokenizer = new StringTokenizer(reader.readLine());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(tokenizer.nextToken());
        }
        Arrays.sort(numbers);
        System.out.println(numbers[k - 1]);
    }
}

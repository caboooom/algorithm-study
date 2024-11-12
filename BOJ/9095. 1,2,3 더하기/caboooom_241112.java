import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            // 연산 결과 미리 저장
            int[] table = new int[12];
            table[1] = 1;
            table[2] = 2;
            table[3] = 4;
            for(int i = 4; i < 12; i++) {
                table[i] = table[i-1] + table[i-2] + table[i-3];
            }

            // 입력 받고 결과 출력
            int t = Integer.parseInt(reader.readLine());
            for(int i = 0; i < t; i++) {
                int n = Integer.parseInt(reader.readLine());
                System.out.println(table[n]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

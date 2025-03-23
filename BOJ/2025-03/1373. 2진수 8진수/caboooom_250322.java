import java.io.*;
import java.math.BigInteger;

// BigInteger 사용하는 풀이도 있길래 따라해봄
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        BigInteger result = new BigInteger(input, 2);
        System.out.println(result.toString(8));
    }

}
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = reader.readLine().split(" ");
        long n1 = Long.parseLong(line[0]) * (long)Math.pow(10, line[1].length()) + Long.parseLong(line[1]);
        long n2 = Long.parseLong(line[2]) * (long)Math.pow(10, line[3].length()) + Long.parseLong(line[3]);
        System.out.println(n1 + n2);
    }
}

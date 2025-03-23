// https://programming-beard.tistory.com/107

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());
        StringBuilder builder = new StringBuilder();

        if (input == 0) {
            builder.append(0);
        } else {
            while (input != 1) {
                builder.append(Math.abs(input % -2));
                input = (int)(Math.ceil((double)input/-2));
            }
            builder.append(input);
        }
        System.out.println(builder.reverse());
    }
}
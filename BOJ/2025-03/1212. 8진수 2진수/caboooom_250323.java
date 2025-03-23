import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        String input = reader.readLine();

        String[] arr = {"000", "001", "010", "011", "100", "101", "110", "111"};

        if(input.equals("0")) {
            builder.append(0);
        }else {
            builder.append(Integer.parseInt(arr[input.charAt(0)-'0']));
            for(int i = 1; i < input.length(); i++) {
                builder.append(arr[input.charAt(i)-'0']);
            }
        }

        System.out.println(builder);
    }
}

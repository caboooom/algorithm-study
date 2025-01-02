import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws IOException {
	    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(bufferedReader.readLine());
	    int[] arr = new int[n];
	    for (int i = 0; i < n; i++) {
	        arr[i] = Integer.parseInt(bufferedReader.readLine());
	    }
	    Arrays.sort(arr);
	    StringBuilder builder = new StringBuilder();
	    for (int i = 0; i < n; i++) {
	        builder.append(arr[i]).append("\n");
	    }
	    System.out.println(builder);
	}
}

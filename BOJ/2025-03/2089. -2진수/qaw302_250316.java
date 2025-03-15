import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		if(N==0) {
			System.out.print("0");
			return;
		}
		int r;
		while(N!=0) {
			r = N%-2;
			if(r==0) {
				sb.append("0");
				N/=-2;
			}
			else {
				sb.append("1");
				N = (N-1)/-2;
			}
		}
		System.out.print(sb.reverse());
	}
}
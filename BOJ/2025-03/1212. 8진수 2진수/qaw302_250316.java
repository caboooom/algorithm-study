import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        br.close();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++) {
            String num = Integer.toBinaryString(str.charAt(i)-'0');
            if(num.length() == 2 && i != 0) {
				num = "0" + num;
			}else if(num.length() == 1 && i != 0) {
				num = "00" + num;
			}
			
			sb.append(num);
        }
        System.out.println(sb);
    }
}
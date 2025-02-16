public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] arr = br.readLine().split(" ");

            int n = Integer.parseInt(arr[0]);
            int k = Integer.parseInt(arr[1]);

            List<Integer> list = new ArrayList<>();

            for (int i = 1; i <= n; i++) {
                list.add(i);
            }
            int index = 0;
            StringBuilder sb = new StringBuilder("<");

            for (int i = 0; i < n; i++) {
                index += k-1;
                if (index >= list.size()) {
                    index %= list.size();
                }

                sb.append(list.remove(index) + ", ");
            }

            System.out.println(sb.substring(0, sb.length() - 2) + ">");
        }
    }
}

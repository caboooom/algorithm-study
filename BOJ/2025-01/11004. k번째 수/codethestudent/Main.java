import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] sorted;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] firstLine = br.readLine().split(" ");

            int N = Integer.parseInt(firstLine[0]);
            int K = Integer.parseInt(firstLine[1]);

            String[] secLine = br.readLine().split(" ");
            int[] arr = new int[N];
            sorted = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(secLine[i]);
            }
            mergeSort(0, (0 + (N - 1)) / 2, N - 1, arr);
            System.out.println(arr[K - 1]);
        }
    }

    private static void mergeSort(int left, int mid, int right, int[] arr) {
        if (left == right) {
            return;
        }
        mergeSort(left, (left + mid) / 2, mid, arr);
        mergeSort(mid + 1, (mid + right) / 2, right, arr);
        merge(left, mid, right, arr);
    }

    private static void merge(int left, int mid, int right, int[] arr) {
        int l = left;
        int r = mid + 1;
        int index = left;

        while (l <= mid && r <= right) {
            if (arr[l] < arr[r]) {
                sorted[index++] = arr[l++];
            } else {
                sorted[index++] = arr[r++];
            }
        }

        while (l <= mid) {
            sorted[index++] = arr[l++];
        }
        while (r <= right) {
            sorted[index++] = arr[r++];
        }
        for (int i = left; i <= right; i++) {
            arr[i] = sorted[i];
        }
    }
}

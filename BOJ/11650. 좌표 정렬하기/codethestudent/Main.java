
// 좌표 정렬하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int[][] sorted;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            int[][] cdr = new int[N][2];
            sorted = new int[N][2];

            for (int i = 0; i < N; i++) {
                String[] nums = br.readLine().split(" ");
                cdr[i][0] = Integer.parseInt(nums[0]);
                cdr[i][1] = Integer.parseInt(nums[1]);
            }
            mergeSort(cdr, 0, N - 1);
            for (int[] a : cdr) {
                System.out.println(a[0] + " " + a[1]);
            }
        }
    }

    private static void mergeSort(int[][] arr, int left, int right) {
        if (left == right)
            return;

        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }

    private static void merge(int[][] arr, int left, int mid, int right) {
        int l = left;
        int r = mid + 1;
        int index = left;

        while (l <= mid && r <= right) {
            if (arr[l][0] < arr[r][0]) {
                sorted[index++] = arr[l++];
            } else if (arr[l][0] == arr[r][0] && arr[l][1] < arr[r][1]) {
                sorted[index++] = arr[l++];
            } else if (arr[l][0] > arr[r][0]) {
                sorted[index++] = arr[r++];
            } else if (arr[l][0] == arr[r][0] && arr[l][1] > arr[r][1]) {
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

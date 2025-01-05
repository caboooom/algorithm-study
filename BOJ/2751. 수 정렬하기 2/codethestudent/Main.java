import java.io.*;

public class Main {
    private static int[] sorted;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            sorted = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }

            // 병합정렬
            merge_sort(arr, 0, arr.length - 1);

            // 퀵정렬 시간 초과
            // quickSort(arr, 0, arr.length - 1);

            // 삽입정렬 시간 초과
            // for (int i = 0; i < N; i++) {
            // arr[i] = Integer.parseInt(br.readLine());
            // int j = i;
            // while (j > 0 && arr[j - 1] > arr[j]) {
            // int temp = arr[j - 1];
            // arr[j - 1] = arr[j];
            // arr[j] = temp;
            // j--;
            // }
            // }

            for (int i : arr) {
                bw.write(String.valueOf(i)); // 정수를 문자열로 변환
                bw.newLine(); // 줄 바꿈 추가
            }
            bw.flush();
        }
    }

    private static void merge_sort(int[] a, int left, int right) {
        if (left == right)
            return;

        int mid = (left + right) / 2;
        merge_sort(a, left, mid);
        merge_sort(a, mid + 1, right);

        merge(a, left, mid, right);
    }

    private static void merge(int[] a, int left, int mid, int right) {
        int l = left;
        int r = mid + 1;
        int index = left;

        while (l <= mid && r <= right) {
            if (a[l] < a[r]) {
                sorted[index++] = a[l++];
            } else {
                sorted[index++] = a[r++];
            }
        }

        if (l > mid) {
            while (r <= right) {
                sorted[index++] = a[r++];
            }
        } else if (r > right) {
            while (l <= mid) {
                sorted[index++] = a[l++];
            }
        }

        for (int i = left; i <= right; i++) {
            a[i] = sorted[i];
        }
    }

    private static void quickSort(int[] arr, int low, int high) {
        /**
         * 1. pivot 을 잡는다
         * 2. pivot 기준으로
         * 3. 종료조건 = low >= high
         */

        if (low >= high) {
            return;
        }

        int left = low;
        int right = high;
        int pivotValue = arr[(left + right) / 2];

        while (left <= right) {
            while (arr[left] < pivotValue) {
                left++;
            }
            while (arr[right] > pivotValue) {
                right--;
            }

            if (left <= right) {
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
                right--;
            }
        }

        quickSort(arr, low, right);
        quickSort(arr, left, high);
    }

}
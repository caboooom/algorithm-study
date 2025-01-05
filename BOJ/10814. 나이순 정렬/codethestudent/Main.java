import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int[] sorted;
    private static String[] sortedName;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            int[] ages = new int[N];
            String[] names = new String[N];
            sorted = new int[N];
            sortedName = new String[N];

            for (int i = 0; i < N; i++) {
                String[] info = br.readLine().split(" ");
                ages[i] = Integer.parseInt(info[0]);
                names[i] = info[1];
            }
            // System.out.println(Arrays.toString(ages));
            // System.out.println(Arrays.toString(names));

            mergeSort(ages, 0, N - 1, names);

            for (int i = 0; i < N; i++) {
                System.out.println(ages[i] + " " + names[i]);
            }
            // System.out.println(Arrays.toString(ages));
            // System.out.println(Arrays.toString(names));
        }
    }

    private static void mergeSort(int[] arr, int left, int right, String[] nameArr) {
        if (left == right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid, nameArr);
        mergeSort(arr, mid + 1, right, nameArr);
        merge(arr, left, mid, right, nameArr);
    }

    private static void merge(int[] arr, int left, int mid, int right, String[] nameArr) {
        int l = left;
        int r = mid + 1;
        int index = left;

        while (l <= mid && r <= right) {
            if (arr[l] < arr[r]) {
                sortedName[index] = nameArr[l];
                sorted[index++] = arr[l++];
            } else if (arr[l] > arr[r]) {
                sortedName[index] = nameArr[r];
                sorted[index++] = arr[r++];
            } else {
                sortedName[index] = nameArr[l];
                sorted[index++] = arr[l++];
            }
        }

        while (l <= mid) {
            sortedName[index] = nameArr[l];
            sorted[index++] = arr[l++];
        }
        while (r <= right) {
            sortedName[index] = nameArr[r];
            sorted[index++] = arr[r++];
        }

        for (int i = left; i <= right; i++) {
            nameArr[i] = sortedName[i];
            arr[i] = sorted[i];
        }
    }
}

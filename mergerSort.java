class mergeSort {

    public static void merge(int[] a, int lower, int mid, int upper) {
        int i, j, k;
        int n = upper - lower + 1;
        int[] b = new int[n];

        i = lower;
        j = mid + 1;
        k = 0;

        while (i <= mid && j <= upper) {
            if (a[i] <= a[j]) {
                b[k] = a[i];
                i++;
            } else {
                b[k] = a[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            b[k] = a[i];
            i++;
            k++;
        }

        while (j <= upper) {
            b[k] = a[j];
            j++;
            k++;
        }

        // Copy the sorted elements from the temporary array back to the original array
        for (i = 0; i < n; i++) {
            a[lower + i] = b[i];
        }
    }

    public static void mergeSort(int[] a, int lower, int upper) {
        if (lower < upper) {
            int mid = (lower + upper) / 2;

            // Recursive calls to divide the array into smaller subarrays
            mergeSort(a, lower, mid);
            mergeSort(a, mid + 1, upper);

            // Merge the sorted subarrays
            merge(a, lower, mid, upper);
        }
    }

    public static void main(String[] args) {
        int[] a = {9, 5, 1, 8, 2, 7, 3};
        int n = a.length;

        System.out.print("Original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        mergeSort(a, 0, n - 1);

        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}

package dynamicProgramming.easy;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = {9, 7, 5, 4, 3};
        mergeSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static void mergeSort(int[] a) {
        if (a.length < 2) {
            return;
        }
        int n = a.length;
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];

        for (int i = 0; i < mid; i++) {
            left[i] = a[i];
        }

        for (int i = mid; i < n; i++) {
            right[i-mid] = a[i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(a, left, right);
    }

    public static void merge(int[] a, int[] left, int[] right) {
        int leftN = left.length;
        int rightN = right.length;

        int i = 0, j = 0, k= 0;
        //copy the smaller one back to a
        while (i < leftN && j < rightN) {
            if (left[i] <= right[j]) {
                a[k++] = left[i++];
            }
            else {
                a[k++] = right[j++];
            }
        }
        //copy the rest of left
        while (i < leftN) {
            a[k++] = left[i++];
        }
        //copy the rest of right
        while (j < rightN) {
            a[k++] = right[j++];
        }
    }
}

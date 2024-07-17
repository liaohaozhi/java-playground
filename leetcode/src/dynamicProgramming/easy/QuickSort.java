package dynamicProgramming.easy;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {9, 7, 5, 4, 8};
        quickSort(array, 0, array.length -1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
    public static void quickSort(int[] array, int begin, int end) {
        if (begin <end) {
            int partitionIndex = partition(array, begin, end);

            quickSort(array, begin, partitionIndex-1);
            quickSort(array, partitionIndex+1, end);
        }
    }

    //This function takes last element as pivot, and places all smaller than pivot to the left of pivot
    // and all greater elements to the right of pivot
    public static int partition(int[] array, int begin, int end) {
        int pivot = array[end]; //the last as pivot
        int i = begin-1;

        for (int j = begin; j < end; j++) {
            if (array[j] <= pivot) {
                i++;

                //swap
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i+1];
        array[i+1] = array[end];
        array[end] = temp;

        return i+1;
    }
}

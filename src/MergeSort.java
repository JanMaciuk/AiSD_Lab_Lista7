public class MergeSort {
    public static long mergeSortTime(int[] array) {
        System.out.print("MergeSort:  ");
        long startTime = System.nanoTime();
        mergeSort(array);
        return System.nanoTime() - startTime;
    }
    private static void mergeSort(int[] array) {
        if (array.length <= 1) return;

        int halfLength = array.length / 2;
        int[] left = new int[halfLength];
        int[] right = new int[array.length - halfLength];

        //dziele array na dwie części:
        for (int i = 0; i < halfLength; i++) {
            left[i] = array[i]; // lewa część
        }
        for (int i = halfLength; i < array.length; i++) {
            right[i - halfLength] = array[i]; // prawa część
        }
        mergeSort(left);//dziele dalej lewą część.
        mergeSort(right);//dziele dalej prawą część.

        merge(array, left, right); // łącze posortowane części.
    }
    private static void merge(int[] array, int[] left, int[] right) {

        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            }
            else {
                array[k++] = right[j++];
            }
        }
        while (i < left.length) {
            array[k++] = left[i++];
        }
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
}

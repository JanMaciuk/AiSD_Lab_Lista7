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

        int leftIndex = 0, rightIndex = 0, arrayIndex = 0;
        //Przenoszę większy element z lewej i prawej strony do array, dopóki jedna z list się nie skończy.
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] <= right[rightIndex]) {
                array[arrayIndex++] = left[leftIndex++];
            }
            else {
                array[arrayIndex++] = right[rightIndex++];
            }
        }
        //Jeżeli jedna lista się skończy, to przenoszę elementy z drugiej bez porównywania (nie ma do czego porównywać)
        while (leftIndex < left.length) {
            array[arrayIndex++] = left[leftIndex++];
        }
        while (rightIndex < right.length) {
            array[arrayIndex++] = right[rightIndex++];
        }
    }
}

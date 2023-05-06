public class HeapSort {

    public static long heapSortTime(int[] array) {
        System.out.print("HeapSort:   ");
        long startTime = System.nanoTime();
        sort(array);
        return System.nanoTime() - startTime;
    }
    private static void sort(int[] array) {

        //Buduje początkowy kopiec
        for (int i = array.length/2 - 1; i >= 0; i--)
            buildHeap(array, array.length, i);

        //Przenoszę po jednym elemencie z kopca do części posortowanej i naprawiam kopiec
        for (int i = array.length - 1; i > 0; i--) {

            //Zamieniam węzeł z ostatnim elementem
            int root = array[0];
            array[0] = array[i];
            array[i] = root;

            // Naprawiam kopiec po zamianie węzła z ostatnim elementem
            // z każdym wykonaniem pętli, rozmiar kopca zmniejsza się o 1, elementy poza kopcem są posortowane.
            buildHeap(array, i, 0);
        }
    }

    //Tworzenie kopca do indeksu heapSize, z korzeniem w rootIndex.
    private static void buildHeap(int[] array, int heapSize, int rootIndex)
    {
        int largestIndex = rootIndex;
        int left = 2 * rootIndex + 1;
        int right = 2 * rootIndex + 2;

        // Sprawdzam, czy lewa odnoga jest większa od węzła.
        if (left < heapSize && array[left] > array[largestIndex])
            largestIndex = left;

        // Sprawdzam, czy prawa odnoga jest większa od węzła.
        if (right < heapSize && array[right] > array[largestIndex])
            largestIndex = right;

        // Jeżeli któraś z odnóg jest większa od węzła, to zamieniam je miejscami i naprawiam kopiec.
        if (largestIndex != rootIndex) {

            // Zamieniam węzeł z większą odnogą
            int rootValue = array[rootIndex];
            array[rootIndex] = array[largestIndex];
            array[largestIndex] = rootValue;

            // Wykonuje dla węzła, który został zamieniony (wykona się, tylko jeżeli wcześniej nastąpiła zamiana)
            buildHeap(array, heapSize, largestIndex);
        }
    }

}

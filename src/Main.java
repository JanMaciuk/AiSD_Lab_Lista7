public class Main {
    public static void main(String[] args) {
        int arrayLength = 10000;
        int div = 100;  // dzielenie z nanosekund: 100=mikrosekundy, 1000000=milisekundy.

        int[] randomArray = RandomArraysGenerator.getRandomArray(arrayLength);
        int[] ascendingArray = RandomArraysGenerator.getAscendingArray(arrayLength);
        int[] descendingArray = RandomArraysGenerator.getDescendingArray(arrayLength);

        System.out.println("czasy w mikrosekundach:");
        runSorting(div, randomArray,"Dane losowe:");
        runSorting(div, ascendingArray,"Dane posortowane rosnąco:");
        runSorting(div, descendingArray,"Dane posortowane malejąco:");
    }

    static void runSorting(int division, int[] array,String text) {
        System.out.println("\n"+text);
        System.out.println(SimpleSorting.InsertSort(array)/ division);
        System.out.println(SimpleSorting.SelectSort(array)/ division);
        System.out.println(SimpleSorting.bubbleSort(array)/ division);
        System.out.println(MergeSort.mergeSortTime(array)/ division);
        System.out.println(QuickSort.quickSortTime(array)/ division);
        System.out.println(HeapSort.heapSortTime(array)/ division);
    }
}
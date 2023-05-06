import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arrayLength = 10000;
        int div = 100;  // dzielenie z nanosekund: 100=mikrosekundy, 1000000=milisekundy.

        int[] randomArray = RandomArraysGenerator.getRandomArray(arrayLength);
        int[] ascendingArray = RandomArraysGenerator.getAscendingArray(arrayLength);
        int[] descendingArray = RandomArraysGenerator.getDescendingArray(arrayLength);

        System.out.println("Czasy w mikrosekundach dla ciągu o długości: "+arrayLength);
        runSorting(div, randomArray,"Dane losowe:");
        runSorting(div, ascendingArray,"Dane posortowane rosnąco:");
        runSorting(div, descendingArray,"Dane posortowane malejąco:");
    }

    static void runSorting(int division, int[] array,String text) {
        System.out.println("\n"+text);

        int [] arrayCopy = Arrays.copyOf(array, array.length); // Kopiuję pierwotny ciąg, aby każdy algorytm operował na tym samym.
        System.out.println(SimpleSorting.InsertSort(array)/ division);

        array = Arrays.copyOf(arrayCopy, arrayCopy.length);
        System.out.println(SimpleSorting.bubbleSort(array)/ division);

        array = Arrays.copyOf(arrayCopy, arrayCopy.length);
        System.out.println(SimpleSorting.SelectSort(array)/ division);

        array = Arrays.copyOf(arrayCopy, arrayCopy.length);
        System.out.println(QuickSort.quickSortTime(array)/ division);

        array = Arrays.copyOf(arrayCopy, arrayCopy.length);
        System.out.println(HeapSort.heapSortTime(array)/ division);

        array = Arrays.copyOf(arrayCopy, arrayCopy.length);
        System.out.println(MergeSort.mergeSortTime(array)/ division);

    }
}
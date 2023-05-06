public class Main {
    public static void main(String[] args) {
        int arrayLength = 10000;
        int divisionFromNanoSeconds = 100;  //100=mikrosekundy, 1000000=milisekundy.
        System.out.println("czasy w mikrosekundach:");
        System.out.println("\ndane losowe:");
        System.out.println(SimpleSorting.InsertSort(RandomArraysGenerator.getRandomArray(arrayLength))/divisionFromNanoSeconds);
        System.out.println(SimpleSorting.SelectSort(RandomArraysGenerator.getRandomArray(arrayLength))/divisionFromNanoSeconds);
        System.out.println(SimpleSorting.bubbleSort(RandomArraysGenerator.getRandomArray(arrayLength))/divisionFromNanoSeconds);
        System.out.println(MergeSort.mergeSortTime(RandomArraysGenerator.getRandomArray(arrayLength))/divisionFromNanoSeconds);
        System.out.println(QuickSort.quickSortTime(RandomArraysGenerator.getRandomArray(arrayLength))/divisionFromNanoSeconds);

        System.out.println("\nDane posortowane rosnąco:");
        System.out.println(SimpleSorting.InsertSort(RandomArraysGenerator.getAscendingArray(arrayLength))/divisionFromNanoSeconds);
        System.out.println(SimpleSorting.SelectSort(RandomArraysGenerator.getAscendingArray(arrayLength))/divisionFromNanoSeconds);
        System.out.println(SimpleSorting.bubbleSort(RandomArraysGenerator.getAscendingArray(arrayLength))/divisionFromNanoSeconds);
        System.out.println(MergeSort.mergeSortTime(RandomArraysGenerator.getAscendingArray(arrayLength))/divisionFromNanoSeconds);
        System.out.println(QuickSort.quickSortTime(RandomArraysGenerator.getAscendingArray(arrayLength))/divisionFromNanoSeconds);

        System.out.println("\nDane posortowane malejąco:");
        System.out.println(SimpleSorting.InsertSort(RandomArraysGenerator.getDescendingArray(arrayLength))/divisionFromNanoSeconds);
        System.out.println(SimpleSorting.SelectSort(RandomArraysGenerator.getDescendingArray(arrayLength))/divisionFromNanoSeconds);
        System.out.println(SimpleSorting.bubbleSort(RandomArraysGenerator.getDescendingArray(arrayLength))/divisionFromNanoSeconds);
        System.out.println(MergeSort.mergeSortTime(RandomArraysGenerator.getDescendingArray(arrayLength))/divisionFromNanoSeconds);
        System.out.println(QuickSort.quickSortTime(RandomArraysGenerator.getDescendingArray(arrayLength))/divisionFromNanoSeconds);




    }
}
import java.util.concurrent.ThreadLocalRandom;

public class QuickSort {
    public static long quickSortTime(int[] array) {
        System.out.print("QuickSort:  ");
        long startTime = System.nanoTime();
        sort(array, 0, array.length-1);
        return System.nanoTime() - startTime;
    }

    /*
    array to tablica, którą sortujemy
    start to indeks początkowy,
    end to indeks końcowy.
    */
    private static void sort(int[] array, int start, int end) {

        if (start < end) {
            int Index = partition(array, start, end);

            //Wywołuję sortowanie dla elementów mniejszych i większych od pivota, pivot jest już w dobrym miejscu.
            sort(array, start, Index-1);
            sort(array, Index+1, end);
        }
    }

    //partition wybiera losowego pivota i ustawia mniejsze elementy na lewo, a większe na prawo.
    private static int partition(int[] array, int start, int end) {
        int pivotIndex = ThreadLocalRandom.current().nextInt(start, end + 1); // Losuje pivota

        int pivotValue=array[pivotIndex]; // Zamieniam pivot z ostatnim elementem zakresu (więc pivot jest na końcu)
        array[pivotIndex]=array[end];
        array[end]=pivotValue;


        int lesserIndex = start-1; // indeks zakresu mniejszych elementów (na początku -1 bo może nie być mniejszych elementów)
        for (int j = start; j < end; j++) { // Iteruje po całym zakresie.

            if (array[j] < pivotValue) {
                lesserIndex++; //Jeżeli obecny element jest mniejszy od pivota, zwiększam zakres mniejszych elementów.

                int iValue = array[lesserIndex];// zamieniam mniejszy element z obecnym (tym dla którego iterujemy)
                array[lesserIndex] = array[j];
                array[j] = iValue;
            }
        }
        lesserIndex++; // Zwiększam lesserIndex o 1, żeby wskazywał na pierwszy element większy od pivota. Mniejsze elementy są do lesserIndex-1 włącznie.
        /*
        Ustawiam pivot na odpowiednie miejsce:
        (pivot był ostatnim elementem, teraz zamieniam go z pierwszym większym od niego).
        Po zamianie mniejsze elementy są po lewo od pivota, a większe po prawo.
         */
        int biggerThanPivotValue = array[lesserIndex];
        array[lesserIndex] = array[end];  //array[end] to pivot przed zamianą
        array[end] = biggerThanPivotValue;

        return lesserIndex; // po zamianie lesserIndex będzie indeksem pivota.
    }

}

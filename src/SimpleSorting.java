public class SimpleSorting {


    //Sortowania proste:

    //Dla każdego elementu po kolei szukam odpowiedniego miejsca w posortowanym zakresie żeby go wstawić.
    public static long InsertSort(int [] lista){
        System.out.print("InsertSort: ");
        long startTime = System.nanoTime();
        for(int i=0;i<lista.length;++i){
            int j = i;
            while(j > 0 && lista[j-1]>lista[j]) { // Szukam odpowiedniego miejsca żeby wstawić następny element
                int currentElement = lista[j];
                lista[j] = lista[j-1];
                lista[j-1] = currentElement;
                j--;
            }
        }
        return System.nanoTime() - startTime;
    }

    //Szukam najmniejszego nieposortowanego elementu i zamieniam go z kolejnym nieposortowanym.
    public static long SelectSort(int[] lista) {
        System.out.print("SelectSort: ");
        long startTime = System.nanoTime();
        int length = lista.length;

        for (int sortedIndex = 0; sortedIndex < length; ++sortedIndex)  {
            int minIndex = sortedIndex;

            for (int sprawdzanyIndex = sortedIndex+1; sprawdzanyIndex < length; sprawdzanyIndex++) {
                if (lista[sprawdzanyIndex] < lista[minIndex]) { // Szukam najmniejszego elementu
                    minIndex = sprawdzanyIndex;
                }
            }

            int replacedElement = lista[minIndex]; // Zamieniam najmniejszy element z następnym nieposortowanym.
            lista[minIndex] = lista[sortedIndex];
            lista[sortedIndex] = replacedElement;
        }
        return System.nanoTime() - startTime;
    }

    //Po kolei dla każdego elementu porównuje czy jest mniejszy od poprzedniego, jeżeli tak to zamieniam je miejscami.
    static long bubbleSort(int[] lista) {
        System.out.print("BubbleSort: ");
        long startTime = System.nanoTime();
        int size = lista.length - 1;

        for (int i = 0; i < size; i++) {

            for (int j = size; j > i; j--) { // > i bo nie porównujemy do elementów już posortowanych

                if (lista[j] < lista[j - 1]) {

                    int replacedElement = lista[j];
                    lista[j] = lista[j - 1];
                    lista[j - 1] = replacedElement;
                }
            }
        }
        return System.nanoTime() - startTime;
    }



}

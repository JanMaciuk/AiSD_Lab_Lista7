public class SimpleSorting {


    //Sortowania proste:
    public static long InsertSort(int [] lista){
        System.out.print("InsertSort: ");
        long startTime = System.nanoTime();
        for(int i=0;i<lista.length;++i){
            int j = i;
            while(j > 0 && lista[j-1]>lista[j]){ // Szukam odpowiedniego miejsca żeby wstawić następny element
                int currentElement = lista[j];
                lista[j] = lista[j-1];
                lista[j-1] = currentElement;
                j = j-1;
            }
        }
        return System.nanoTime() - startTime;
    }

    public static long SelectSort(int[] lista) {
        System.out.print("SelectSort: ");
        long startTime = System.nanoTime();
        int length = lista.length;

        for (int sortedIndex = 0; sortedIndex < length; ++sortedIndex)  {
            int maxIndex = sortedIndex;

            for (int sprawdzanyIndex = sortedIndex+1; sprawdzanyIndex < length; sprawdzanyIndex++) {
                if (lista[sprawdzanyIndex] < lista[maxIndex]) { // Szukam najmniejszego elementu
                    maxIndex = sprawdzanyIndex;
                }
            }

            int replacedElement = lista[maxIndex]; // Zamieniam najmniejszy element z następnym nieposortowanym.
            lista[maxIndex] = lista[sortedIndex];
            lista[sortedIndex] = replacedElement;
        }
        return System.nanoTime() - startTime;
    }


    static long bubbleSort(int[] lista) {
        System.out.print("BubbleSort: ");
        long startTime = System.nanoTime();
        int size = lista.length - 1;

        for (int i = 0; i < size; i++) {

            for (int j = size; j > i; j--) { // > i bo porównujemy do elementów już posortowanych

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

package algortimosordenacao;

import java.util.Random;

public class AlgortimosOrdenacao {

    public static void main(String[] args) {

        int[] array = new int[10];
        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();
        MergeSort ms = new MergeSort();
        HeapSort hs = new HeapSort();
        RadixSort rs = new RadixSort();
            
        Random gerador = new Random(19700621);
        for (int i = 0; i < 10; i++) {
            array[i] = gerador.nextInt(10);
        }

        Chronometer.start();
        /*
         * use your sorte method here i.e.:
         * qs.sort for QuickSort
         * bs.sort for BubbleSort
         * ms.sort for MergeSort
         * hs.sort for HeapSort
         * rs.sort for RadixSort         
         */      
        rs.sort(array);
        Chronometer.stop();
        System.out.println("Time esapsed: " + (Chronometer.elapsedTime()));
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i] + ",");
        }

    }

}

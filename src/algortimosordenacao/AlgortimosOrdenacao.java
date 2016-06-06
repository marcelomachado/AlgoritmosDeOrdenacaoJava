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
        int t;
//        for (int i = 0; i <= 100; i++) {
//            array[i] = i;
//            System.out.println(array[i] + ",");
//        }
//        for (int i = 10; i >= 1; i--) {
//            t = 10 - i;
//            array[t] = i;
//            System.out.println(array[t] + ",");
//        }

        Random gerador = new Random(19700621);
        for (int i = 0; i < 10; i++) {
            array[i] = gerador.nextInt(10);
        }

        Chronometer.start();
        rs.sort(array);
        Chronometer.stop();

        System.out.println("Tempo:" + (Chronometer.elapsedTime()));
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i] + ",");
        }

    }

}

package algortimosordenacao;

public class HeapSort {

    public static void sort(int array[]) {
        int n = array.length;
        heapify(array);
        for (int i = n; i > 0; i--) {
            swapNumbers(array, 0, i);
            n = n - 1;
            maxheap(array, 0);
        }
    }

    public static void heapify(int array[]) {
        int n = array.length;
        n = array.length - 1;
        for (int i = n / 2; i >= 0; i--) {
            maxheap(array, i);
        }
    }

    public static void maxheap(int array[], int i) {
        int n = array.length;
        int left = 2 * i;
        int right = 2 * i + 1;
        int max = i;
        if (left <= n && array[left] > array[i]) {
            max = left;
        }
        if (right <= n && array[right] > array[max]) {
            max = right;
        }

        if (max != i) {
            swapNumbers(array, i, max);
            maxheap(array, max);
        }
    }

    public static void swapNumbers(int array[], int i, int j) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

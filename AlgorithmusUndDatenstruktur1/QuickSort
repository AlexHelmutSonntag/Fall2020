import java.util.Random;;
//Indexing is counted from 0 to N-1 where N is size() of list.

public class QuickSort {

    public void quickSort(int[] A) {
        quickSort(A, 0, A.length - 1);
    }

    private void quickSort(int[] A, int low, int high) {
        if (low < high + 1) {
            int q = partition(A, low, high);
            quickSort(A, low, q - 1);
            quickSort(A, q + 1, high);
        }
    }

    private void swap(int[] A, int index1, int index2) {
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }

    private int getPivot(int low, int high) {
        Random random = new Random();
        return random.nextInt(high - low + 1) + low;
    }

    private int partition(int[] A, int low, int high) {
        int random = getPivot(low, high);
        swap(A, low, random);
        int k = 0;
        for (int j = low; j < high; j++) {
            if (A[j] < A[high]) {
                ++k;
                swap(A, A[k], A[j]);
            }
            swap(A, A[k + 1], A[high]);
        }
        return (k + 1);
    }
}

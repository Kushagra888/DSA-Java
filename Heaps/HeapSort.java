package Heaps;

public class HeapSort {

    private static void heapify(int arr[], int i, int size) {
        int left = 2*i + 1;
        int right = 2*i + 2;
        int maxIdx = i;

        if(left < size && arr[left] > arr[maxIdx]) {
            maxIdx = left;
        }

        if(right < size && arr[right] > arr[maxIdx]) {
            maxIdx = right;
        }

        if(maxIdx != i) {
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr, maxIdx, size);
        }
    }
    
    public static void heapSort(int arr[]) {
        int n = arr.length;

        // build maxheap , accessing the all non - leaf nodes of the heap.
        for(int i=n/2; i>=0; i--) {
            heapify(arr, i, n);
        }

        // push element at last
        for(int i=n-1; i>0; i--) {
            // swap
            int t = arr[0];
            arr[0] = arr[i];
            arr[i] = t;
            
            heapify(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 4};

        heapSort(arr);

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

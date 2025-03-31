package DivideAndConquer;

public class QuickSort {
    
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int arr[], int si, int ei) {
        // base case
        if(si >= ei) {
            return;
        }

        int pIdx = partition(arr, si, ei);

        quickSort(arr, si, pIdx-1);

        quickSort(arr, pIdx+1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si-1;

        for(int j=si; j<ei; j++) {
            if(arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        arr[ei] = arr[i];
        arr[i] = pivot;
        return i;
    }


    public static void main(String[] args) {
        int arr[] = {5,2,7,0,3,4,8,1};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}

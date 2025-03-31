package DivideAndConquer;

public class MergeSort {

    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        // base case
        if(si >= ei) {
            return;
        }
        // calculate mid
        int mid = si + (ei-si)/2;

        // left part
        mergeSort(arr,si,mid);

        // right part
        mergeSort(arr, mid+1, ei);

        // merge
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei-si+1];
        int i = si; // iterator for left part
        int j = mid+1; // iterator for right part
        int k = 0; // iterator for temp array

        // merging
        while(i <= mid && j <= ei) {
            if(arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // for remaining elements
        while(i <= mid) {
            temp[k++] = arr[i++];
        }

        while(j <= ei) {
            temp[k++] = arr[j++];
        }

        // copying temp arr to the orignal arr

        for(k=0, i=si; k<temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,1,5,8,3,6,4,9};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
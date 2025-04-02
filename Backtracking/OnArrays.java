package Backtracking;

public class OnArrays {

    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void decTwo(int arr[], int i, int val) {
        // base case
        if(i == arr.length) {
            printArr(arr);
            return;
        }

        // recursion
        arr[i] = val;
        decTwo(arr, i+1, val+1); // recursive call
        arr[i] -= 2;
    }

    public static void main(String args[]) {
        int arr[] = new int[5];
        decTwo(arr, 0, 1);
        printArr(arr);
    }
}
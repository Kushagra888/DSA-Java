package Recursion;

public class ArraySorted {
    
    public static boolean checkArr(int arr[], int i) {
        // base case
        if(i == arr.length-1) {
            return true;
        }

        if(arr[i] > arr[i+1]) {
            return false;
        }

        return checkArr(arr, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,0};

        System.out.println(checkArr(arr, 0));
    }
}

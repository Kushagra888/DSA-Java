package Recursion;

public class AllOccur {
    
    public static void printAllOccur(int arr[], int key, int idx) {
        if(idx == arr.length) {
            return;
        }

        if(arr[idx] == key) {
            System.out.println(idx);
        }

        printAllOccur(arr, key, idx+1);
    }

    public static void main(String[] args) {
        int arr[] = {2,3,5,3,6,8,3,4,1};
        int key = 3;
        printAllOccur(arr, key, 0);
    }
}
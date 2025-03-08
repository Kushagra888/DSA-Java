package Recursion;

public class FirstOccur {
    
    public static int firstCheck(int arr[], int i, int key) {
        if(i == arr.length) {
            return -1; // not found
        }

        if(arr[i] == key) {
            return i;
        }

        return firstCheck(arr, i+1, key);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,7,9,6};
        System.out.println(firstCheck(arr, 0, 6));
    }
}

package Recursion;

public class LastOccur {
    
    public static int lastCheck(int arr[], int key, int i) {
        // base case
        if(i == arr.length) {
            return -1;
        }

        int isFound = lastCheck(arr, key, i+1);

        if(isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,4,6,8,4};

        System.out.println(lastCheck(arr, 4, 0));
        System.out.println(lastCheck(arr, 9, 0));
        System.out.println(lastCheck(arr, 3, 0));
    }
}

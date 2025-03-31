package DivideAndConquer;

public class RotatedSearchArray {
    // search in a sorted and rotated array

    public static int search(int arr[], int tar, int si, int ei) {
        // base case
        if(si > ei) {
            return -1;
        }

        // work
        int mid = si + (ei-si)/2;

        // case Found!
        if(arr[mid] == tar) {
            return mid;
        }

        // mid on L1
        if(arr[si] <= arr[mid]) {
            // case a: left part
            if(arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid-1);
            }
            // case b: right part
            else {
                return search(arr, tar, mid+1, ei);
            }
        }

        // mid on L2
        else {
            // case a: right part
            if(arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid+1, ei);
            }
            // case b: left part
            else {
                return search(arr, tar, si, mid-1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,6,2,8,0,5,2,1,9};
        int target = 0; // output = 4
        System.out.println(search(arr, target, 0, arr.length-1));
    }
}

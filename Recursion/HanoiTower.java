package Recursion;

public class HanoiTower {
    
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        // base case
        if(n == 1) {
            System.out.println("transfer disk: " + n + " from " + src + " to " + dest);
            return;
        }

        // transfer n-1 disks from src to helper
        towerOfHanoi(n-1, src, dest, helper);

        // transfer nth disk from src to dest
        System.out.println("transfer disk: " + n + " from " + src + " to " + dest);

        // transfer n-1 disks from helper to dest
        towerOfHanoi(n-1, helper, src, dest);
    }

    public static void main(String[] args) {
        towerOfHanoi(3,"A","B","C");
    }
}

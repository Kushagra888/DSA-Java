package Recursion;

public class FriendsPairing {
    
    public static int waysPair(int n) {
        // base case
        if(n == 1 || n == 2) {
            return n;
        }

        // choice-single
        int singWays = waysPair(n-1);

        // choice-pair
        int fnm2 = waysPair(n-2);
        int pairWays = (n-1) * fnm2;
        
        // total ways
        return singWays + pairWays;
    }

    public static void main(String[] args) {
        System.out.println(waysPair(3));
    }
}

package Arrays;

public class Brute {

    public static void bruteforce(int numbers[]) {

        int ms = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++) {

            for(int j=i; j<numbers.length; j++) {
                int cs = 0;

                for(int k=i; k<=j; k++) {
                    cs += numbers[k];
                }
                System.out.println(cs);
                ms = Math.max(ms, cs);
            
            }
            System.out.println();

        }
        System.out.println("Maximum sum is : " + ms);
    }

    public static void main(String args[]) {
        int numbers[] = {-2, -5, -4, -6, -9, -3};
        bruteforce(numbers);

    }
}

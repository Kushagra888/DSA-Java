package Arrays;

public class Kadanes {
    
    public static void kadane(int numbers[]) {

        boolean allNeg = true;

        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] >= 0) {
                allNeg = false;
            }
        }

        if(allNeg == false) {

            int ms = Integer.MIN_VALUE;
            int cs = 0;

            for(int i=0; i<numbers.length; i++) {
                cs += numbers[i];

                if(cs < 0) {
                    cs = 0;
                }

                ms = Math.max(cs, ms);
            }

            System.out.println(ms);

        } else {
            int maxi = Integer.MIN_VALUE;

            for(int i=0; i<numbers.length; i++) {
                maxi = Math.max(maxi, numbers[i]);
            }

            System.out.println(maxi);
        }

    }


    public static void main(String args[]) {
        int numbers[] = {-2, -5, -4, -6, -9, -3};

        kadane(numbers);

    }

}

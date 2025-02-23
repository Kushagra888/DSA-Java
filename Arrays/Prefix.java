package Arrays;

public class Prefix {
    
    public static void pre(int numbers[]) {

        int ms = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];

        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }


        for(int i=0; i<numbers.length; i++) {
            
            int cs = 0;
            int start = i;
            for(int j=i; j<numbers.length; j++) {
                int end = j;

                cs = (start == 0)? prefix[end] : prefix[end] - prefix[start-1];

                ms = Math.max(cs, ms);
            }
        }

        System.out.println(ms);

    }


    public static void main(String args[]) {
        int numbers[] = {-2, -5, -4, -6, -9, -3};

        pre(numbers);

    }

}

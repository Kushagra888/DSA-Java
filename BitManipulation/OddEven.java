package BitManipulation;

public class OddEven {
    public static void main(String[] args) {
        int bitMask = 1;

        int n = 5;

        if((n&bitMask) == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}

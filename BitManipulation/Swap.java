package BitManipulation;

public class Swap {
    public static void main(String[] args) {
        int a = 5; //  0101
        int b = 10; // 1010
        System.out.println("val of a: " + a + " val of b: " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("val of a: " + a + " val of b: " + b);

    }
}

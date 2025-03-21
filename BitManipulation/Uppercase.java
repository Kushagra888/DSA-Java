package BitManipulation;

public class Uppercase {
    public static void main(String[] args) {

        // lowercase to uppercase
        for(char ch='a'; ch<='z'; ch++) {
            System.out.print((char) (ch ^ ' ')); // ' ' --> ascii  code = 32 (-ve)
        }

        System.out.println();

        // uppercase to lowercase
        for(char ch='A'; ch<='Z'; ch++) {
            System.out.print((char) (ch | ' ')); // ' ' --> ascii  code = 32 (+ve)
        }
    }
}

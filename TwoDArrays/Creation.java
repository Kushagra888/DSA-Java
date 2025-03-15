package TwoDArrays;

public class Creation {
    
    public static void print(int matrix[][]) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean search(int matrix[][], int key) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    System.out.println("Element found at: " + i + "," + j);
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String args[]) {
        // int matrix[][] = new int[2][3];

        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        print(matrix);
        System.out.println(search(matrix, 12));
    }
}

package TwoDArrays;
public class Transpose {

    public static void transpose(int matrix[][]) {

        int n = matrix.length;
        int m = matrix[0].length;
        int mat[][] = new int[m][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                mat[j][i] = matrix[i][j];
            }
        }

        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }


    }
    
    public static void main(String args[]) {
        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        transpose(matrix);
    }
}

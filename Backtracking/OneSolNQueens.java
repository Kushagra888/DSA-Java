package Backtracking;

public class OneSolNQueens {

    public static void printBoard(char board[][]) {
        System.out.println("-------chess board-------");

        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // vertical up
        for(int i=row-1; i>=0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonal left
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonal right
        for(int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        return true;

    }
    
    public static boolean queens(char board[][], int row) {

        // base case
        if(row == board.length) {
            return true;
        }

        // recursion
        for(int j=0; j<board.length; j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if(queens(board, row+1)) {
                    return true;
                }
                board[row][j] = 'X';
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        // initalize
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                board[i][j] = 'X';
            }
        }

        if(queens(board, 0)) {
            System.out.println("Solution is possible..");
            printBoard(board);
        } else {
            System.out.println("Solution is not possible..");
        }


    }
}

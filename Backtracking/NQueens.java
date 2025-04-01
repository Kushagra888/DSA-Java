package Backtracking;

public class NQueens {

    // Time complexity = O(n!) ==> first queen has n choices, the next queen will have n-1 choices and last queen will have only 1 choice.

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
    
    public static void queens(char board[][], int row) {

        // base case
        if(row == board.length) {
            printBoard(board);
            return;
        }

        // recursion
        for(int j=0; j<board.length; j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';
                queens(board, row+1);
                board[row][j] = 'X';
            }
        }
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
        queens(board, 0);
    }
}

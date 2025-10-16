import java.util.Scanner;

public class MeloTicTacToe {
    public static Scanner input = new Scanner(System.in);
    public static char[][] board = new char[3][3];

    public static void main(String[] args) {
        initializeBoard();
        char currentPlayer = 'X';
        boolean gameOver = false;

        // Main game loop
        while (!gameOver) {
            printBoard();

            // Get player move
            System.out.println("Player " + currentPlayer + ", enter row (0-2): ");
            int row = input.nextInt();
            System.out.println("Player " + currentPlayer + ", enter column (0-2): ");
            int col = input.nextInt();

            // Check for valid input range
            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Invalid input, row and column must be between 0 and 2.");
                continue;
            }

            // Place mark if valid
            boolean validMove = placeMark(row, col, currentPlayer);
            if (!validMove) {
                System.out.println("Invalid move, try again.");
                continue; // Skip rest of loop and ask again
            }

            // Check for win
            if (checkWin(currentPlayer)) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                gameOver = true;
            }
            // Check for draw
            else if (isBoardFull()) {
                printBoard();
                System.out.println("It's a draw!");
                gameOver = true;
            }
            // Switch player
            else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
    }

    // Initializes the board with spaces
    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Prints the board with grid lines
    public static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // Places the player's mark on the board if the space is empty
    public static boolean placeMark(int row, int col, char mark) {
        if (board[row][col] == ' ') {
            board[row][col] = mark;
            return true;
        }
        return false;
    }

    // Checks if the player has won
    public static boolean checkWin(char mark) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == mark && board[i][1] == mark && board[i][2] == mark) {
                return true;
            }
            if (board[0][i] == mark && board[1][i] == mark && board[2][i] == mark) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == mark && board[1][1] == mark && board[2][2] == mark) {
            return true;
        }
        if (board[0][2] == mark && board[1][1] == mark && board[2][0] == mark) {
            return true;
        }

        return false;
    }

    // Checks if the board is full (no empty spaces)
    public static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}

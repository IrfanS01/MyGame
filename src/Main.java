
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name1 = Player.enterName();
        Player player = new Player(name1);

        String name2 = Player2.enterName();
        Player player2 = new Player(name2);

        System.out.println("Welcome, " + player.getName() + "  and  " + player2.getName() + "! Let's start the game");

        Scanner scanner = new Scanner(System.in);

        player.HowToPlay();

        char[][] board = {{' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}};

        printBoard(board);

        while (true) {
            player1Turn(board, scanner);
            if (isGameFinished(board)) {
                break;
            }
            printBoard(board);

            player2Turn(board);
            if (isGameFinished(board)) {
                break;
            }
            printBoard(board);
        }
        scanner.close();
    }

     private static void player2Turn(char[][] board) {
         String userInput;
         Scanner scanner = new Scanner(System.in);
         while (true) {
             System.out.println("Player 2's turn:");
             System.out.println("Where would you like to play? (1-9)");
             userInput = scanner.nextLine();
             if (isValidMove(board, userInput)){
                 break;
             } else {
                 System.out.println(userInput + " is not a valid move.");
             }
     }
        placeMove(board, userInput, 'O');

    }
    private static boolean isGameFinished(char[][] board) {

        if (hasContestantWon(board, 'X')) {
            printBoard(board);
            System.out.println("Player1 wins!");
            return true;
        }



        if (hasContestantWon(board, 'O')) {
            printBoard(board);
            System.out.println("Player2 wins!");
            return true;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        printBoard(board);
        System.out.println("The game ended in a tie!");
        return true;

    }



    private static boolean hasContestantWon(char[][] board, char symbol) {
        if ((board[0][0] == symbol && board [0][1] == symbol && board [0][2] == symbol) ||
                (board[1][0] == symbol && board [1][1] == symbol && board [1][2] == symbol) ||
                (board[2][0] == symbol && board [2][1] == symbol && board [2][2] == symbol) ||

                (board[0][0] == symbol && board [1][0] == symbol && board [2][0] == symbol) ||
                (board[0][1] == symbol && board [1][1] == symbol && board [2][1] == symbol) ||
                (board[0][2] == symbol && board [1][2] == symbol && board [2][2] == symbol) ||

                (board[0][0] == symbol && board [1][1] == symbol && board [2][2] == symbol) ||
                (board[0][2] == symbol && board [1][1] == symbol && board [2][0] == symbol) ) {
            return true;
        }
        return false;
    }

    private static void makeMove(char[][] board, String move, char symbol) {
        int position = Integer.parseInt(move) - 1;
        int row = position / 3;
        int col = position % 3;
        board[row][col] = symbol;
    }

    private static boolean isValidMove (char[][] board, String position) {
        switch(position) {
            case "1":
                return (board[0][0] == ' ');
            case "2":
                return (board[0][1] == ' ');
            case "3":
                return (board[0][2] == ' ');
            case "4":
                return (board[1][0] == ' ');
            case "5":
                return (board[1][1] == ' ');
            case "6":
                return (board[1][2] == ' ');
            case "7":
                return (board[2][0] == ' ');
            case "8":
                return (board[2][1] == ' ');
            case "9":
                return (board[2][2] == ' ');
            default:
                return false;
        }
    }

    private static void player1Turn(char[][] board, Scanner scanner) {
        String userInput;
        while (true) {
            System.out.println("Player 1's turn:");
            System.out.println("Where would you like to play? (1-9)");
            userInput = scanner.nextLine();
            if (isValidMove(board, userInput)){
                break;
            } else {
                System.out.println(userInput + " is not a valid move.");
            }
        }
        placeMove(board, userInput, 'X');
    }

    private static void placeMove(char[][] board, String position, char symbol) {
        switch(position) {
            case "1":
                board[0][0] = symbol;
                break;
            case "2":
                board[0][1] = symbol;
                break;
            case "3":
                board[0][2] = symbol;
                break;
            case "4":
                board[1][0] = symbol;
                break;
            case "5":
                board[1][1] = symbol;
                break;
            case "6":
                board[1][2] = symbol;
                break;
            case "7":
                board[2][0] = symbol;
                break;
            case "8":
                board[2][1] = symbol;
                break;
            case "9":
                board[2][2] = symbol;
                break;
            default:
                System.out.println(":(");
        }
    }

    private static void printBoard(char[][] board) {
        System.out.println(board[0][0] + "|" +  board[0][1] + "|" +  board[0][2] );
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" +  board[1][1] + "|" +  board[1][2] );
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" +  board[2][1] + "|" +  board[2][2] );
    }

}

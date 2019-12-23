import java.util.Scanner;
import java.util.Arrays;

public class TicTacToe {
    private int size = 3;
    
    private char [][] gameBoard;
    private int [][] gameBoardPositions;
    
    private int turnNumber;
    private boolean oTurn;

    public TicTacToe(int size) {
        this.size = size;
        char [][] board = new char [size][size];
        gameBoard = board;

        fillGameBoard();
        fillGameBoardPositions();

        turnNumber = 1;
        oTurn = false;
    }

    public TicTacToe() {
        this(3);
    }

    public void fillGameBoard() {
        char position = '0';
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                gameBoard[i][j] = position++;
            }
        }
    }

    public void fillGameBoardPositions() {
        gameBoardPositions = new int[size * size][2];
        int row = 0;
        int col = 0;
        for(int i = 0; i < gameBoardPositions.length; i++){
            int position = i;
            gameBoardPositions[position][0] = row;
            gameBoardPositions[position][1] = col;

            col++;
            if(col == size){
                col = 0;
                row++;
            
            }

        }

    }

    public boolean makeMove(int position) {
        boolean madeMove = false;
            
        if(turnNumber > 9){
            System.out.println("Error, maximum turns made.");
            System.exit(0);
        }
        else if(position > 9 || position < 0){
            System.out.println("Error, enter a move between 0 and 8.");
            return false;
        }

        int row = gameBoardPositions[position][0];
        int col = gameBoardPositions[position][1];

        if(gameBoard[row][col] == 'O' || gameBoard[row][col] == 'X'){
            System.out.println("Error, move already made at that position.");
            return false;
        }else{
            gameBoard[row][col] = whosTurn();
            madeMove = true;
            oTurn = !oTurn;
            turnNumber++;
        }        
        return madeMove;
    }

    public char whosTurn() {
        return (oTurn ? 'O' : 'X');
    }

    public void resetGame() {
        fillGameBoard();
        fillGameBoardPositions();

        turnNumber = 1;
        oTurn = false;
    }

    public char isGameOver() {
        char retVal = '-';

        for (int i = 0; i < size; i++) {
            if((gameBoard[i][0] == 'X' || gameBoard[i][0] == 'O') && (gameBoard[i][0] == gameBoard[i][1]) && (gameBoard[i][1] == gameBoard[i][2])){
                if(gameBoard[i][0] == 'X'){
                    retVal = 'X';
                    return retVal;
                }else{
                    retVal = 'O';
                    return retVal;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            if((gameBoard[0][i] == 'X' || gameBoard[0][i] == 'O') && (gameBoard[0][i] == gameBoard[1][i]) && (gameBoard[1][i] == gameBoard[2][i])){
                if(gameBoard[0][i] == 'X'){
                    retVal = 'X';
                    return retVal;
                }else{
                    retVal = 'O';
                    return retVal;
                }
            }
        }

        if(((gameBoard[0][0] == 'X' || gameBoard[0][0] == 'O') && (gameBoard[0][0] == gameBoard[1][1]) && (gameBoard[1][1] == gameBoard[2][2])) || ((gameBoard[0][2] == 'X' || gameBoard[0][2] == 'O') && (gameBoard[0][2] == gameBoard[1][1]) && (gameBoard[1][1] == gameBoard[2][0]))){
            if(gameBoard[1][1] == 'X'){
                retVal = 'X';
                return retVal;
            }else{
                retVal = 'O';
                return retVal;
            }
        }

        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if(Character.isDigit(gameBoard[i][j])){
                    retVal = '-';
                    return retVal;
                }else{
                    retVal = 'T';
                    
                }
            } 
        }
        return retVal;
    }

    public String toString() {
        String retVal = "";

        retVal += "Turn: " + (oTurn ? "O" : "X") + "\n";
        retVal += "Turn Number: " + turnNumber + "\n";
        for(int i = 0; i < gameBoard.length; i++) {
            retVal += "| ";
            for(int j = 0; j < gameBoard[i].length; j++) {
                retVal += gameBoard[i][j] + " | ";
            }
            retVal += "\n";
        }

        return retVal;
    }

    public static void main(String [] args) {
        TicTacToe ttt = new TicTacToe();
        System.out.println(ttt);

        boolean playAgain;
        Scanner scan = new Scanner(System.in);
        do {

            char state;
            do {
                state = ttt.isGameOver();
                switch(state) {
                    case '-':
                        System.out.print("Enter a move (" + ttt.whosTurn() + "): ");
                        int move = scan.nextInt();
                        if(ttt.makeMove(move)) {
                            System.out.println("Made a move successfully.");
                        }
                        System.out.println(ttt);
                        break;
                    case 'X':
                    case 'O':
                        System.out.println("Player " + state + " wins!!!");
                        break;
                    case 'T':
                        System.out.println("Cats game :|");
                        break;
                    default:
                        System.out.println("This shouldn't happen. Something went wrong");
                        return;
                }
            } while(state == '-');

            System.out.print("Would you like to play again? (yes/no) ");
            String answer = scan.next();
            if(answer.equals("yes")) {
                playAgain = true;
                ttt.resetGame();
            } else {
                playAgain = false;
            }
        } while(playAgain);
    }
}
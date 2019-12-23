import java.util.Scanner;
import java.io.*;
public class ChessGame {

    String pieces;
    char activeColor;
    String castlingOptions;
    String enPassant;

    public ChessGame(String b) throws InvalidFenException {
        Scanner scan = new Scanner(b);
        scan.useDelimiter(" ");
        pieces = scan.next();
        if(scan.hasNext()){
            activeColor = scan.next().charAt(0);
            if (activeColor != 'b' && activeColor != 'w') {
                throw new InvalidFenException(1);
            }
        }else{
            throw new InvalidFenException(0);            
        }
        if(scan.hasNext()){
            castlingOptions = scan.next();
        }
        if(scan.hasNext()){
            enPassant = scan.next();
            if(!(enPassant.matches("-|([a-h][1-8])"))) {
                throw new InvalidFenException(2);
            }
        }else{
            throw new InvalidFenException(0);
        }
    }

    public void printBoard(){
        Scanner parse = new Scanner(pieces);
        parse.useDelimiter("/");
            
        while(parse.hasNext()){
            String field = parse.next();
            for(int i = 0; i < field.length(); i++){
                char c = field.charAt(i);
                if(Character.isDigit(c)){
                    int d = Integer.parseInt(String.valueOf(c));
                    for(int j = 0; j < d; j++){
                        System.out.print(".");
                    }
                }else{
                    System.out.print(c);
                }
            }
            System.out.print("\n");
        }
        if(activeColor == 'w'){
            System.out.println("It is white's move.");
        }else{
            System.out.println("It is black's move.");
        }
          
        if(castlingOptions.equals("-")){
            System.out.println("It is not possible to castle.");
        }else{
            System.out.println("The castling options are: " + castlingOptions);
        }
          
        if(enPassant.equals("-")){
            System.out.println("En passant is not available.");
        }else{
            System.out.println("En passant is available.");
        }         
    }
}


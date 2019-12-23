import java.util.ArrayList;

public class BoardGameClient {
    public static void main(String [] args) {
        BoardGame life = new BoardGame("Life", "2 to 6", "Yes");
        BoardGame monopoly = new BoardGame("Monopoly", "2 to 8", "No");
        BoardGame risk = new BoardGame("Risk", "2 to 6", "Yes");
        BoardGame candyland = new BoardGame("Candyland", "2 to 4", "No");

        ArrayList<BoardGame> gameList = new ArrayList<>();

        gameList.add(life);
        gameList.add(monopoly);
        gameList.add(risk);
        gameList.add(candyland);
        
        gameList.add(new BoardGame("Sorry", "2 to 4", "No"));

       
        for(BoardGame game : gameList) {
            System.out.println(game);
        }
    }
}
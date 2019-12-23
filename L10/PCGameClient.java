import java.util.ArrayList;

public class PCGameClient {
    public static void main(String [] args) {
        PCGame fornite = new PCGame("A game for 9 year olds to play.", 4*1024, 16*1024, 2.4f);
        PCGame minecraft = new PCGame("A game about virtual legos.", 4*1024, 1*1024, 2.4f);
        PCGame wow = new PCGame("A game for when you decide to give up on college.", 2*1024, 5*1024, 2.0f);
        PCGame goatSimulator = new PCGame("A goat simulator.", 2*1024, 2*1024, 2.0f);

        // ArrayLists!
        ArrayList<PCGame> gameList = new ArrayList<>();

        gameList.add(fornite);
        gameList.add(minecraft);
        gameList.add(wow);
        gameList.add(goatSimulator);
        // I can also make a new PCGame and add it at the same time
        gameList.add(new PCGame("Best game ever.", 4*1024, 30*1024, 2.0f));

        // enhanced for loop! "for each" loop
        for(PCGame game : gameList) {
            System.out.println(game);
        }
    }
}
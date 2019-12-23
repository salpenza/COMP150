//Write a class encapsulating a board game, which inherits from Game. A board game has the following additional attributes: the number of players and whether the game can end in a tie. Code the constructor, the setters, the getters and the toString method of the new class.

//Write a client class similar to PCGameClient to test your class.

public class BoardGame extends Game {
    String numOfPlayers;
    String tie;

    public BoardGame(String description, String numOfPlayers, String tie) {
        super(description);
        this.numOfPlayers = numOfPlayers;
        this.tie = tie;
    }

    public String getNumOfPlayers(){
        return numOfPlayers;
    }

    public void setNumOfPlayers(String numOfPlayers) {
        this.numOfPlayers = numOfPlayers;
    }

    public String getTie(){
        return tie;
    }

    public void setTie(String tie) {
        this.tie = tie;
    }

    public String toString() {
        return super.toString() + "\n" + "Number of players:  " + numOfPlayers + "\n" + "Tie?: " + tie + "\n";
    }
}
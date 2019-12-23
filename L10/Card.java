public class Card {
    public final static String[] SUITS = { "Diamonds", "Clubs", "Hearts", "Spades" };
    public final static String[] RANKS = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King",
            "Ace" };

    // Declare two private integers, suit and rank.
    private int suit, rank;

    /**
     * Call the setSuit and setRank methods, passing the suit and rank arguments respectively.
     * 
     * @param suit, an integer representing the index of the SUITS array
     * @param rank, an integer representing the index of the RANKS array
     */
    public Card(int suit, int rank) {
        setSuit(suit);
        setRank(rank);
    }

    /**
     * Checks if the rank is within the valid range, what is that range? prints an error otherwise. See expected output for details.
     * 
     * @param rank
     */
    private void setRank(int rank) {
        if(rank < 13 && rank >= 0){
            this.rank = rank;
        }else{
            System.out.println("Error: Invalid rank: " + rank);
        }
    }

    /**
     * Checks if the suit is within the valid range, what is that range? prints an error otherwise. See expected output for details.
     */
    //Error: Invalid suit: -1
    private void setSuit(int suit) {
        if(suit < 4 && suit >= 0){
            this.suit = suit;
        }else{
            System.out.println("Error: Invalid suit: " + suit);
        }
    }

    /**
     * @return int - the rank value of the Card instance
     */
    public int getRankIndex() {
        return rank;
    }

    /**
     * @return The short name of the card, D7 for 7 of Diamands for instance.
     * Or, DT for 10 of Diamonds
     * Or, DQ for Queen
     */
     public String getShortName() {
        // Hint, how do you get the first character of a String?
        String currentR = RANKS[rank];
        String currentS = SUITS[suit];
        char firstR = currentR.charAt(0);
        char firstS = currentS.charAt(0);
        if(firstR == '1'){
            firstR = 'T';
        }
        String retval = firstS + "" + firstR;
        return retval;

    }

    @Override
    public String toString() {
        String retVal = "";

        retVal += RANKS[rank] + " of " + SUITS[suit];

        return retVal;
    }

    public static void main(String[] args) {
        Card c = new Card(-1, 0);
        c = new Card(0, -1);
        c = new Card(4, 0);
        c = new Card(0, 13);

        c = new Card(2, 10);
        System.out.println(c.getShortName());
        System.out.println(c);
        System.out.println(c.getRankIndex());
    }
}
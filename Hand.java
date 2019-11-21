import java.util.ArrayList;

public class Hand {
    /* declare a private array list of type Card called cards */
    private ArrayList<Card> cards = new ArrayList<>();
    /*
     * Instantiate the cards as a new arraylist.
     */
    public Hand() {
        cards = new ArrayList<>();
    }

    /*
     * Add card to cards at index 0 (how do you add to an ArrayList at a given  index?)
     */
    public void addCard(Card card) {
        cards.add(card);
    }

    /*
     * Returns the card from the top of the hand meaning, return the card at
     * cards.size() - 1.
     * Make sure you use the ArrayLists' remove method since we are removing the card from our hand!
     * If the size is 0, return null instead
     */
    public Card playCard() {
        if(cards.size() == 0){
            return null;
        }else{
            Card retval = cards.get(cards.size() - 1);
            cards.remove(retval);
            return retval;
        }
    }

    /*
     * Return the size of the ArrayList
     */
    public int totalInHand() {
        return cards.size();
    }

    @Override
    public String toString() {
        String retVal = "Currently in hand: ";
        for (Card c : cards) {
            retVal += c.getShortName() + ", ";
        }
        return retVal;
    }

    public static void main(String[] args) {
        Card c = new Card(0, 0);
        Hand h = new Hand();
        h.addCard(c);
        h.addCard(new Card(0, 1));
        h.addCard(new Card(0, 2));
        System.out.println(h);
        System.out.println(h.totalInHand());
        System.out.println(h.playCard());
        System.out.println(h);
    }
}
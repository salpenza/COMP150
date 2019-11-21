import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Deck {
    private final int SHUFFLES = 100;
    int used = 0;
    /* declare a private ArrayList of type Card called cards */
    private ArrayList<Card> cards = new ArrayList<>();

    /*
     * Instantiate the ArrayList cards Generate the 52 cards.
     * Use a double for loop to create a card for each suit and rank. Add each card to the ArrayList cards.
     */
    public Deck() {
        // Hint: rank and suit are integers. How are they related to the type of card?
        ArrayList<Card> cards = new ArrayList<>();
        this.cards = cards;
        for(int i = 0; i < 4 && i >= 0; i++){
            for(int j = 0; j < 13 && j >= 0; j++){
                cards.add(new Card(i, j));
            }
        }
        System.out.println("The deck has " + cards.size() + " cards.");
    }

    /*
     * For each shuffle, generate two random numbers between 0 and the length of the array.
     * Swap the cards at each of those indexes using the ArrayList's set method.
     */
    public void shuffle() {
        Random rand = new Random(12345678);
        for (int i = 0; i < SHUFFLES; ++i) {
            int num1 = rand.nextInt(cards.size());
            int num2 = rand.nextInt(cards.size());
            Card temp = cards.get(num1);
            cards.set(num1, cards.get(num2));
            cards.set(num2, temp);
        }
    }

    /*
     * Returns the Card object from the top of the deck. If the size is 0, return null
     * The top of the Deck is the highest available index of the array.
     */
    public Card dealCard() {
        
        if(cards.size() == 0){
            return null;
        }else{         
            return cards.remove(cards.size() - 1);   
        }       
    }

    @Override
    public String toString() {
        String retVal = "";

        for (Card card : cards) {
            retVal += card.getShortName() + " ";
        }
        return retVal;
    }

    public static void main(String[] args) {
        Deck d = new Deck();
        d.shuffle();
        System.out.println(d);
        Card c = d.dealCard();
        System.out.println(c);
    }
}

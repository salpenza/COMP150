import java.util.ArrayList;
import java.util.Scanner;

public class WarCycles {
    private Deck deck;
    private Hand playerOne;
    private Hand playerTwo;
    String initialDeck;
    public WarCycles() {      
        
        // Create a new Deck instance and assign it to the instance variable field.
        Deck deck = new Deck();
        this.deck = deck;
     
        // Shuffle the deck
        deck.shuffle();
        initialDeck = deck.toString();
        // instantiate playerOne and playerTwo as new Hand's

        Hand playerOne = new Hand();
        Hand playerTwo = new Hand();
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        // deal Card's, one a time, to each players hand. Order matters!
        // Use the Deck's dealCard() method and Hand's addCard() method.
        // dealCard() returns null when there are no more cards left.
        boolean turn = false;
        int i = 0;
        while(i < 52){
            if(turn){
                playerOne.addCard(deck.dealCard());
                turn = !turn;
            }else{
                playerTwo.addCard(deck.dealCard());
                turn = !turn;
            }
            i++;
        }
    }

    private void play() {

        /*
            In this method we will play the game of WAR!
            Logically, we need to do these things
            1. Check if the game is over
            2. Print a menu to the user (Enable auto play, play a round, quit)
            * Note, the menu will not be displayed once auto play is enabled
            3. Play a card from each players hand and add it to a stack.
            4.1 The player with the highest card wins the round and is awarded the stack
            4.2 If there was a draw, each player adds three more cards to the stack and the round is over.
            * The stack can potentially be collected on the next Round
            5. Repeat until the game is over or the user quits from the menu
        */
        ArrayList<Card> stack = new ArrayList<>();
        int round = 1;
        do {
           
            // Check if the game is over (The game is over when one of the players Hands are empty)
            // If the game is over, print the winning player and return from the method (just a return statement)
            if(playerOne.totalInHand() == 0 || playerTwo.totalInHand() == 0){
                if(playerOne.totalInHand() == 0){
                    return;
                }else{
                    return;
                }
            }

            // If autoPlay is false, display a menu
            // Menu:
            //  1 - Enable auto play.
            //  2 - Play a round.
            //  3 - Quit the game.
            // Use nextInt() from a scanner to get the menu option
            // Use a switch statement to perform the users choice
            /* 
                On option 1, set autoPlay to true
                On option 2, print "Playing a round."
                On option 3, return from the method
            */

            /*if(autoPlay == false){
                System.out.println("1 - Enable auto play.\n2 - Play a round.\n3 - Quit the game.");
                System.out.print("Selection: ");
                menuOption = scan.nextInt();

                switch (menuOption) {
                    case 1:
                      autoPlay = true;
                      break;
                    case 2:
                      System.out.println("Playing a round.");
                      break;
                    case 3:
                      return;         
                }
            }
         
            */ 

            // Display the number of cards player one has
            // Display the number of cards player two has

            // Have each player draw a Card.
            // Make sure to save the Card returned from the players Hard into a Card reference
            // Card playerOnesCard = ... ?
            // Add both cards to the stack
            //Card playerOnesCard = new Card();
            //Card playerTwosCard = new Card();

            Card playerOnesCard = playerOne.playCard();
            Card playerTwosCard = playerTwo.playCard();
            stack.add(playerOnesCard);
            stack.add(playerTwosCard);



            // Display what Card each player played from their hand. (use the short name)
            
            // To compare cards, we need the rank index from each card
            // int playerOnesCardRankIndex = ... ?

            int playerOnesCardRankIndex = playerOnesCard.getRankIndex();
            int playerTwosCardRankIndex = playerTwosCard.getRankIndex();
            
            // Compare the cards
            /* If they are equal
                print WAR!
                Each player adds three cards to the stack
            */
            /* If player ones card is greater
                For each card in the stack
                remove it and add it to player ones hand. 
            */
            /* If player twos card is greater
                For each card in the stack
                remove it and add it to player twos hand.
            */
            
        if(playerOnesCardRankIndex == playerTwosCardRankIndex){
            for (int i = 0; i < 3; i++){
                playerOnesCard = playerOne.playCard();
                stack.add(playerOnesCard);
                playerTwosCard = playerTwo.playCard();
                stack.add(playerTwosCard);
            }   
        }else if(playerOnesCardRankIndex > playerTwosCardRankIndex){
            for (int i = 0; i < stack.size(); i++){
                playerOne.addCard(stack.get(i));               
            }    
            stack.clear();                         
        }else if(playerOnesCardRankIndex < playerTwosCardRankIndex){
            for (int i = 0; i < stack.size(); i++){
                playerTwo.addCard(stack.get(i));               
            }   
            stack.clear(); 
            }

            round++;
        } while (round <= 1000);
            System.out.println("Potential cycle detected with deck:");
            System.out.println("The deck has 52 cards.");
            System.out.println(initialDeck);       
    }

    public static void main(String[] args) {
        int games = 0;
        while(games <= 10000000){
            WarCycles war = new WarCycles();
            war.play();
            games++;

        }
    }
}

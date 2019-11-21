import java.util.ArrayList;
import java.util.Scanner;

public class WarWithDice {
    private Deck deck;
    private Hand playerOne;
    private Hand playerTwo;

    public WarWithDice() {
        System.out.println("==================================================");
        System.out.println("Opening a fresh pack of cards.");
        
        // Create a new Deck instance and assign it to the instance variable field.
        Deck deck = new Deck();
        this.deck = deck;
        System.out.println(deck);
        System.out.println();

        System.out.println("Shuffling the deck.");
        
        // Shuffle the deck
        deck.shuffle();
        System.out.println(deck);
        System.out.println("");

        System.out.println("Deal the cards to two players.");
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

        System.out.print("Player One:\n\t");
        System.out.println(playerOne);
        System.out.print("Player Two:\n\t");
        System.out.println(playerTwo);
        System.out.println("==================================================");
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

        int menuOption = '0';
        boolean autoPlay = false;
        Scanner scan = new Scanner(System.in);
        ArrayList<Card> stack = new ArrayList<>();
        int round = 1;

        do {
            // Check if the game is over (The game is over when one of the players Hands are empty)
            // If the game is over, print the winning player and return from the method (just a return statement)
            if(playerOne.totalInHand() == 0 || playerTwo.totalInHand() == 0){
                if(playerOne.totalInHand() == 0){
                    System.out.println("Player Two is the winner.");
                    return;
                }else{
                    System.out.println("Player One is the winner.");
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

            if(autoPlay == false){
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

            System.out.println("================== Round " + round + " ======================");
            // Display the number of cards player one has
            // Display the number of cards player two has
            System.out.println("Player One has " + playerOne.totalInHand() + " cards.");
            System.out.println("Player Two has " + playerTwo.totalInHand() + " cards.");


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
            
            System.out.println("Player One drew a " + playerOnesCard.getShortName());
            System.out.println("Player Two drew a " + playerTwosCard.getShortName());

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

                Each player adds four cards to the stack.
                Each player rolls two dice.
                The player with the highest sum the stack.
                If there is a die, repeat steps 1-3.
            */

            Die playerOneDice1 = new Die(6);
            Die playerOneDice2 = new Die(6);
            Die playerTwoDice1 = new Die(6);
            Die playerTwoDice2 = new Die(6);
            //playerOneDice1.roll();
            //playerOneDice2.roll();
            //playerTwoDice1.roll();
            //playerTwoDice2.roll();
            int hold1 = playerOneDice1.roll();
            int hold2 = playerOneDice2.roll();
            int hold3 = playerTwoDice1.roll();
            int hold4 = playerOneDice2.roll();
            int playerOneDiceTotal = hold1 + hold2;
            int playerTwoDiceTotal = hold3 + hold4;

            if(playerOnesCardRankIndex == playerTwosCardRankIndex){
                System.out.println("WAR! Draw four additional cards, roll the dice!");
                for (int i = 0; i < 4; i++){
                    playerOnesCard = playerOne.playCard();
                    stack.add(playerOnesCard);
                    playerTwosCard = playerTwo.playCard();
                    stack.add(playerTwosCard);
                }
                //playerOneDice1 = roll();
                //playerOneDice2 = roll();
                //playerTwoDice1 = roll();
                //playerTwoDice2 = roll();

                //playerOneDiceTotal = playerOneDice1 + playerOneDice2;
                //playerTwoDiceTotal = playerTwoDice1 + playerTwoDice2;
                System.out.println("Player One rolled a " + hold1 + " and " + hold2 + " for " + playerOneDiceTotal + ".");
                System.out.println("Player Two rolled a " + hold3 + " and " + hold4 + " for " + playerTwoDiceTotal + ".");

                if(playerOneDiceTotal == playerTwoDiceTotal){
                    while(playerOneDiceTotal == playerTwoDiceTotal){
                        System.out.println("TIE! Draw four additional cards, roll again!");
                        for (int i = 0; i < 4; i++){
                            playerOnesCard = playerOne.playCard();
                            stack.add(playerOnesCard);
                            playerTwosCard = playerTwo.playCard();
                            stack.add(playerTwosCard);
                        }
                        //playerOneDice1.roll();
                        //playerOneDice2.roll();
                        //playerTwoDice1.roll();
                        //playerTwoDice2.roll();
                        playerOneDiceTotal = playerOneDice1.roll() + playerOneDice2.roll();
                        playerTwoDiceTotal = playerTwoDice1.roll() + playerTwoDice2.roll();
                        System.out.println("Player One rolled a " + playerOneDice1 + " and " + playerOneDice2 + " for " + playerOneDiceTotal + ".");
                        System.out.println("Player Two rolled a " + playerTwoDice1 + " and " + playerTwoDice2 + " for " + playerTwoDiceTotal + ".");
                    }

                }else if(playerOneDiceTotal > playerTwoDiceTotal){
                    System.out.println("Player One Wins !!!");
                    System.out.println("Player One Collects:\n");
                    for (int i = 0; i < stack.size(); i++){
                        playerOne.addCard(stack.get(i));
                        System.out.print(stack.get(i).getShortName() + " ");                 
                    }    
                    System.out.print("\n");
                    stack.clear();                         
                }else if(playerOneDiceTotal < playerTwoDiceTotal){
                    System.out.println("Player Two Wins !!!");
                    System.out.println("Player Two Collects:\n");
                    for (int i = 0; i < stack.size(); i++){
                        playerTwo.addCard(stack.get(i));
                        System.out.print(stack.get(i).getShortName() + " ");                   
                    }
                    System.out.print("\n");
                    stack.clear(); 
            
                }

            }else if(playerOnesCardRankIndex > playerTwosCardRankIndex){
                System.out.println("Player One Wins !!!");
                System.out.println("Player One Collects:\n");
                for (int i = 0; i < stack.size(); i++){
                    playerOne.addCard(stack.get(i));
                    System.out.print(stack.get(i).getShortName() + " ");                 
                }    
                System.out.print("\n");
                stack.clear();                         
            }else if(playerOnesCardRankIndex < playerTwosCardRankIndex){
                System.out.println("Player Two Wins !!!");
                System.out.println("Player Two Collects:\n");
                for (int i = 0; i < stack.size(); i++){
                    playerTwo.addCard(stack.get(i));
                    System.out.print(stack.get(i).getShortName() + " ");                   
                }
                System.out.print("\n");
                stack.clear(); 
            }

            System.out.println("================== End " + round + " ========================");

            round++;
        } while (menuOption != 3);

        scan.close();
    }

    public static void main(String[] args) {
        System.out.println("WAR!");
        System.out.println("");

        WarWithDice war = new WarWithDice();
        war.play();

        System.out.println("");
        System.out.println("PEACE?");
    }
}

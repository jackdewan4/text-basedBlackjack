import java.util.Scanner;
public class BlackJack {
    Deck deck = new Deck();
    Hand pHand = new Hand();
    Hand dHand = new Hand();
    Scanner in = new Scanner(System.in);

    public void reset(boolean reshuffle){

        if(reshuffle == true){
            deck.Build();
            deck.Shuffle();
        }
    }
    public void deal(){
        // deals two cards into both hands
        deck.Deal();
        pHand.add(deck.top);
        deck.Deal();
        dHand.add(deck.top);
        deck.Deal();
        pHand.add(deck.top);
        deck.Deal();
        dHand.add(deck.top);
    }

    public void playerTurn(){

        char response;
        while(pHand.getTotalValue() < 16){
            //System.out.println("Would you like to hit?(y/n)");
            //response = in.next().charAt(0);
            //if(response == 'y' || response == 'Y'){
                deck.Deal();
                pHand.add(deck.top);
                //System.out.println(pHand.toString());
                //System.out.println( "Your hand has total of: " + pHand.getTotalValue());

            //}else{
                //break;
            }
        System.out.println("Player's hand is: " + pHand.getTotalValue());

        //}
        /*if(pHand.getTotalValue() > 21){
            System.out.println("Bust!!");
        }else if(pHand.getTotalValue() == 21){
            System.out.println("Player has blackjack");
        }*/



    }

    public void dealerTurn(){
        while(dHand.getTotalValue() < 17){
            deck.Deal();
            dHand.add(deck.top);

        }
        System.out.println("Dealer's hand is: " + dHand.getTotalValue());

        /*if(dHand.getTotalValue()> 21){
            System.out.println("Dealer bust.");
        }else if(dHand.getTotalValue() == 21){
            System.out.println("Dealer has blackjack");
        }*/


    }

    public static void main(String [] args){

        char answer = 'y';
        System.out.println("Welcome to BlackJack");
        BlackJack game = new BlackJack();

        for(int i = 0; i < 25; i++) {

            System.out.println("Welcome to a new round of BlackJack:");
            //while(answer == 'y' || answer == 'Y'){
            // sets up game by building a deck of 52 cards and shuffling it.
            if (game.deck.deck.size() < 20) {
                game.reset(true);
            }
            game.deal();

                /*System.out.println(game.pHand.toString());
                System.out.println(game.pHand.getTotalValue());*/
            // run player turn
            game.playerTurn();
            // run dealer turn
            game.dealerTurn();

            if (game.pHand.getTotalValue() < 21 && game.dHand.getTotalValue() < 21) {

                if (game.pHand.getTotalValue() > game.dHand.getTotalValue()) {
                    System.out.println("Player wins!!");

                } else if (game.pHand.getTotalValue() < game.dHand.getTotalValue()) {
                    System.out.println("Dealer wins!!");
                }

            }


            if (game.pHand.getTotalValue() > 21 && game.dHand.getTotalValue() > 21) {
                System.out.println("Player and dealer both bust, push!");
            } else if (game.pHand.getTotalValue() == 21 && game.dHand.getTotalValue() == 21) {
                System.out.println("Player and dealer both have blackjack, push!");
            } else if (game.pHand.getTotalValue() < 21 && game.dHand.getTotalValue() > 21) {
                System.out.println("Player wins! Dealer bust!");
            } else if (game.dHand.getTotalValue() < 21 && game.pHand.getTotalValue() > 21) {
                System.out.println("Dealer wins! Player bust!");
            } else if (game.dHand.getTotalValue() == game.pHand.getTotalValue()) {
                System.out.println("Player and dealer have the same value hand, push!");
            } else if (game.dHand.getTotalValue() == 21) {
                System.out.println("Dealer has blackjack");
            } else if (game.pHand.getTotalValue() == 21) {
                System.out.println("Player has blackjack");
            }


            game.pHand.reset();
            game.dHand.reset();
            //System.out.println( "\n" +"Would you like to play another game?(y/n)");
            //answer = game.in.next().charAt(0);
            //if(answer == 'n' || answer == 'N'){
            //System.out.println("Thanks for playing BlackJack today!!");


            //}

        }// }
    }
}

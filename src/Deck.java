import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Deck {

    ArrayList <Card> deck = new ArrayList<>();

    public Card top;

  /*  public Deck(){
        this.Build();

    }*/

    public void Build(){

       /* Card card = new Card();

        // loop to add 4 aces to deck
        for(int i = 0; i < 4; i++ ){
            deck.add(i, card.ace);
        }
        // loop to add 4 two's to deck
        for(int i = 4; i < 8; i++ ){
            deck.add(i, card.two);
        }
        // loop to add 4 threes to deck
        for(int i = 8; i < 12; i++ ){
            deck.add(i, card.three);
        }
        // loop to add 4 fours to deck
        for(int i = 12; i < 16; i++ ){
            deck.add(i, card.four);
        }
        // loop to add 4 fives to deck
        for(int i = 16; i < 20; i++ ){
            deck.add(i, card.five);
        }
        // loop to add 4 sixs to deck
        for(int i = 20; i < 24; i++ ){
            deck.add(i, card.six);
        }
        // loop to add 4 sevens to deck
        for(int i = 24; i < 28; i++ ){
            deck.add(i, card.seven);
        }
        // loop to add 4 eights to deck
        for(int i = 28; i < 32; i++ ){
            deck.add(i, card.eight);
        }
        // loop to add 4 nines to deck
        for(int i = 32; i < 36; i++ ){
            deck.add(i, card.nine);
        }
        // loop to add 4 tens to deck
        for(int i = 36; i < 40; i++ ){
            deck.add(i, card.ten);
        }
        // loop to add 4 jacks to deck
        for(int i = 40; i < 44; i++ ){
            deck.add(i, card.jack);
        }
        // loop to add 4 queens to deck
        for(int i = 44; i < 48; i++ ){
            deck.add(i, card.queen);
        }
        // loop to add 4 kings to deck
        for(int i = 48; i < 52; i++ ){
            deck.add(i, card.king);
        }*/

        // adds a card of value 1 - 9 4x each
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 4; j++){
                deck.add(new Card(i+1));
            }
        }
        // adds a card of value 10 16x
        for(int i = 0; i <16; i++){
            deck.add(new Card(10));
        }
    }

    // shuffles the deck of cards
    public void Shuffle(){
        // shuffles deck of cards using shuffle function of collections library
        Collections.shuffle(this.deck);

    }

    public Card Deal(){
        // creates variable of top card on deck
        top = deck.get(0);
        //removes top card from deck
        deck.remove(top);
        // returns top card from deck
        return top;

    }

    // test method for methods of deck class
   /* public static void main(String [] args){
        Deck Deck = new Deck();
        Hand hand = new Hand();
        Deck.Build();
        System.out.println("The fresh deck looks like: " + Deck.deck.toString());
        System.out.println("The deck size: " + Deck.deck.size() + "\n");

        Deck.Shuffle();

        System.out.println( "Shuffled deck: " + Deck.deck.toString());
        System.out.println("The deck size: " + Deck.deck.size());

        Deck.Deal();

        // testing method hand.add
        hand.add(Deck.top);
        System.out.println( "Shuffled deck: " + Deck.deck.toString());
        System.out.println("The deck size: " + Deck.deck.size());
        System.out.println(hand.size());
        System.out.println(hand.getCard(0));


    }*/

}

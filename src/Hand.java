import java.util.ArrayList;

public class Hand {
    ArrayList< Card > hand = new ArrayList<>();

    public void add(Card card){
        hand.add(card);
        //System.out.println(hand.toString());

    }

    public int size(){
        // gets number of cards in hand
        int size = hand.size();
        return size;
    }

    public Card getCard(int i){
        Card value = hand.get(i);

        return value;
    }

    public int getTotalValue(){
        int sum = 0;
        Card value;
        for(int i =0; i < hand.size(); i++){
            value = hand.get(i);
            Card card = new Card(value);

            sum += card.getValue();
        }
        return sum;

    }

    public void reset(){
        // reset hand to 0
        hand.clear();
    }

    public String toString(){
        return "Your hand looks like this: " + hand;
    }



    // testing methods of hand class
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
        //testing toString method
        System.out.println(hand.toString());

        // testing hand.getTotalValue method
        hand.getTotalValue();
        System.out.println("Total value of hand: " + hand.getTotalValue());
        System.out.println(hand.getCard(0));


        // tests hand.reset method
        //hand.reset();
        //System.out.println(hand.size());



    }*/


}

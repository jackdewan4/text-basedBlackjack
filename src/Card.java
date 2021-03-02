public class Card {
   /* int ace = 1;
    int two = 2;
    int three = 3;
    int four = 4;
    int five = 5;
    int six = 6;
    int seven = 7;
    int eight = 8;
    int nine = 9;
    int ten = 10;
    int jack = 10;
    int queen = 10;
    int king = 10;
    String diamond;
    String heart;
    String club;
    String spade;*/
    int value;
    String s;

    public Card(int i){
        if(i >= 1 && i <= 10){
            value = i;
        }
    }


    public Card(Card i){
        s = String.valueOf(i);
        value = Integer.valueOf(s);


    }

    public int getValue(){


        return value;
    }
    public String toString(){
        return "" + value;

    }

    // test method for for methods of card class
    /*public static void main(String [] args){
        Card card = new Card(1);
        System.out.println("The value of card is " + card.getValue());
    }*/

}

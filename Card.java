import java.awt.Color;

public class Card {

    // instance variables/class variables
    private char rank;
    private String suit;
    private boolean isFaceUp;

    // constructor - a method to create the object
    // gives values to the instance variables
    public Card(char rank, String suit){
        // this. means "class ____"
        this.rank = rank;
        this.suit = suit;
        
        // make every card start off face down
        this.isFaceUp = false;
    }

    public String getSuit(){
        return this.suit;
    }

    public char getRank(){
        return this.rank;
    }

    public boolean isFaceUp(){
        return this.isFaceUp;
    }

    public Color getColour(){
        if(this.suit.equals("Clubs") || 
            this.suit.equals("Spades")){
                return Color.BLACK;
        }else{
                return Color.RED;
        }
    }

    public void flip(){
        // if it is face up
        if(this.isFaceUp){
            // make it not face up
            this.isFaceUp = false;
        }else{
            // if it was face down, it is now face up
            this.isFaceUp = true;
        }
    }

    
}

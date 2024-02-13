public class Main {
    public static void main(String[] args) {
        Card card1 = new Card('5', "Spades");
        Card card2 = new Card('A', "Hearts");

        System.out.println(card1.getSuit());
        System.out.println(card2.getSuit());

        card1.flip();
        System.out.println(card1.isFaceUp());
        System.out.println(card2.isFaceUp());
    }
}

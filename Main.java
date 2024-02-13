public class Main {
    public static void main(String[] args) {
        Card card1 = new Card('5', "Spades");
        Card card2 = new Card('A', "Hearts");

        System.out.println(card1.getSuit());
        System.out.println(card2.getSuit());

        card1.flip();
        System.out.println(card1.isFaceUp());
        System.out.println(card2.isFaceUp());
    
        System.out.println(card2);

        Stack s = new Stack();
        s.push(3);
        s.push(5);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
        s.pop();
    
    }
}

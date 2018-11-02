package ms225hk;

public class PlayCardsMain {

	public static void main(String[] args) {
		Deck deck = new Deck();
		// System.out.println(deck.toString());
		deck.shuffle();
		deck.deal();
		deck.deal(5);
		System.out.println(deck.getDeckSize() + " cards left in deck");
		deck.print();
		
		deck.shuffle();
	}


}

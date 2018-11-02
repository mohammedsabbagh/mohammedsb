package ms225hk;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

	private List<Card> cards = new ArrayList<>();
	private List<Card> dealed = new ArrayList<>();

	public Deck() {
		reset();
	}

	public void reset() {
		cards.clear();
		dealed.clear();
		for (Card.Suite suite : Card.Suite.values()) {
			for (Card.Rank rank : Card.Rank.values()) {
				Card card = new Card(suite, rank);
				cards.add(card);
			}
		}
	}

	public void shuffle() {
		if (cards.size() < 52) {
			System.out.println("Deck size is " + String.valueOf(cards.size()) + ", shuffling will not be executed");
			return;
		}

		Random random = new Random();
		int x;
		for (int i = 0; i < 52; ++i) {
			x = random.nextInt(52);
			Card tmp = cards.get(i);
			cards.set(i, cards.get(x));
			cards.set(x, tmp);
		}
	}

	public Card deal() {
		dealed.add(cards.get(cards.size() - 1));
		Card card = cards.get(cards.size() - 1);
		cards.remove(cards.size() - 1);
		return card;
	}

	public void deal(int count) {
		for (int i = 0; i < count; ++i) {
			dealed.add(cards.get(cards.size() - 1));
			cards.remove(cards.size() - 1);
		}
	}

	public int getDeckSize() {
		return cards.size();
	}

	
	public void print() {
		for (int i = 0; i < cards.size() - 1; ++i) {
			System.out.println(cards.get(i).toString());
		}
	}
	
}

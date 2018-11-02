package ms225hk;

import ms225hk.Card.Rank;

public class Play123Main {

	public static void main(String[] args) {
		Deck deck = new Deck();
		int count = 10000;
		int wins = 0;
		for (int i = 0; i < count; ++i) {
			if (play123(deck))
				++wins;
		}
		System.out.printf("won %d out of %d, win percentage is %.0f percent.", wins, count, ((double)wins / count) * 100);
	}

	public static boolean play123(Deck deck) {
		deck.reset();
		deck.shuffle();

		int step = 0;
		int deckSize = deck.getDeckSize();
		for (int i = 0; i < deckSize; i++) {
			Card card = deck.deal();
			switch (step) {
			case 0:
				if (card.getRank() == Rank.Ace)
					return false;
				break;
			case 1:
				if (card.getRank() == Rank.Two)
					return false;
				break;
			case 2:
				if (card.getRank() == Rank.Three)
					return false;
				break;
			default:
				step = -1;
				break;
			}
			++step;
		}

		return true;
	}

}

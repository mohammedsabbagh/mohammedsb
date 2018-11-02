package ms225hk;

public class Card {

	public enum Suite {
		Diamonds, Clubs, Hearts, Spades
	};

	public enum Rank {
		Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
	};

	private Suite suite;
	private Rank rank;

	public Card(Suite suite, Rank rank) {
		this.suite = suite;
		this.rank = rank;
	}

	public String toString() {
		return rankToString(rank) + " " + suiteToString(suite);
	}

	public static String suiteToString(Suite suite) {
		switch (suite) {
		case Diamonds:
			return "Diamonds";
		case Clubs:
			return "Clubs";
		case Hearts:
			return "Hearts";
		case Spades:
			return "Spades";
		default:
			return "";
		}
	}

	public static String rankToString(Rank rank) {
		switch (rank) {
		case Ace:
			return "Ace";
		case Jack:
			return "Jack";
		case Queen:
			return "Queen";
		case King:
			return "King";
		case Two:
			return "Two";
		case Three:
			return "Three";
		case Four:
			return "Four";
		case Five:
			return "Five";
		case Six:
			return "Six";
		case Seven:
			return "Seven";
		case Eight:
			return "Eight";
		case Nine:
			return "Nine";
		case Ten:
			return "Ten";
		default:
			return "";
		}
	}

	public Rank getRank() {
		return rank;
	}

	public Suite getSuite() {
		return suite;
	}
}

package ms225hk;

public class MultiDisplay {

	private String displayMessage;
	private int displayCount;

	public void setDisplayMessage(String displayMessage) {
		this.displayMessage = displayMessage;
	}

	public String getDisplayMessage() {
		return displayMessage;
	}

	public void setDisplayCount(int count) {
		this.displayCount = count;
	}

	public void display() {
		for (int i = 0; i < displayCount; i++) {
			System.out.println(displayMessage);
		}
	}

	public void display(String displayMessage, int count) {
		this.displayMessage = displayMessage;
		this.displayCount = count;
		display();

	}

}

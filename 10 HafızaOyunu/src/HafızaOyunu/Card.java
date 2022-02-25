package HafýzaOyunu;

public class Card {
	
	private char value; //kartýn harf olarak deðeri
	private boolean guess = false; //tahminin doðruluðu yanlýþlýðý , baþlangýçta bütün kartlar için yanlýþ
	
	public Card(char value) {
		super();
		this.value = value;
	}

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

	public boolean isGuess() {
		return guess;
	}

	public void setGuess(boolean guess) {
		this.guess = guess;
	}
	
	
	

}

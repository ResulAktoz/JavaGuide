package Haf�zaOyunu;

public class Card {
	
	private char value; //kart�n harf olarak de�eri
	private boolean guess = false; //tahminin do�rulu�u yanl��l��� , ba�lang��ta b�t�n kartlar i�in yanl��
	
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

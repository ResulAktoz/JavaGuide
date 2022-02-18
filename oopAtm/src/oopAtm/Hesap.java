package oopAtm;

public class Hesap {
	private String kullan�c�Ad�;
	private String parola;
	private int bakiye;
	public Hesap() {
		super();
	}
	public Hesap(String kullan�c�Ad�, String parola, int bakiye) {
		super();
		this.kullan�c�Ad� = kullan�c�Ad�;
		this.parola = parola;
		this.bakiye = bakiye;
	}
	public String getKullan�c�Ad�() {
		return kullan�c�Ad�;
	}
	public void setKullan�c�Ad�(String kullan�c�Ad�) {
		this.kullan�c�Ad� = kullan�c�Ad�;
	}
	public String getParola() {
		return parola;
	}
	public void setParola(String parola) {
		this.parola = parola;
	}
	public int getBakiye() {
		return bakiye;
	}
	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
	}
	public void paraYat�r(int tutar) {
		bakiye += tutar; //class�n i�inde oldu�umuz i�in this. yazmad�k
		System.out.println("yeni bakiye: " +bakiye);
	}
	public void paraCek(int tutar) {
		if((bakiye-tutar)<0) {
			System.out.println("bakiye yetersiz");
			
		}else {
			bakiye -= tutar;
			System.out.println("yeni bakiye: " +bakiye);
		}
	}

}

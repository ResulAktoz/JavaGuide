package oopAtm;

public class Hesap {
	private String kullanıcıAdı;
	private String parola;
	private int bakiye;
	public Hesap() {
		super();
	}
	public Hesap(String kullanıcıAdı, String parola, int bakiye) {
		super();
		this.kullanıcıAdı = kullanıcıAdı;
		this.parola = parola;
		this.bakiye = bakiye;
	}
	public String getKullanıcıAdı() {
		return kullanıcıAdı;
	}
	public void setKullanıcıAdı(String kullanıcıAdı) {
		this.kullanıcıAdı = kullanıcıAdı;
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
	public void paraYatır(int tutar) {
		bakiye += tutar; //classın içinde olduğumuz için this. yazmadık
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

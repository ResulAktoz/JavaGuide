package Referanslar;

public class Account {
		private String hesapNo;
		private double bakiye;
		private String isim;
		private String email;
		private String telefonNo;
	public Account() {
	super();
//		this.hesapNo = "bilgi yok";
//		this.isim = "bilgi yok";
//		this.bakiye = 0;
//		this.email = "bilgi yok";
//		this.telefonNo = "bilgi yok";
		//this("bilgi yok",0,"bilgi yok","bilgi yok","bilgi yok"); bu þekilde bilgi alabiliriz direkt
		//System.out.println("kendi yazdýðýmýz");
	}
	public Account(String isim,String email, String telefonNo) {
		/*this.isim = isim;
		this.email = email;
		this.telefonNo = telefonNo;
		this.bakiye= 0.0;
		this.telefonNo= "2345";*/
		this("bilgi yok",0.0,isim,email,telefonNo);
	}
	public void bilgileriGöster() {
		System.out.println("hesap no: " +this.hesapNo);
		System.out.println("bakiye: " +this.bakiye);
		System.out.println("isim: " +this.isim);
		System.out.println("email: " +this.email);
		System.out.println("telefon no: " +this.telefonNo);
		
	}
	public Account(String hesapNo, double bakiye, String isim, String email, String telefonNo) {
		super();
		this.hesapNo = hesapNo;
		this.bakiye = bakiye;
		this.isim = isim;
		this.email = email;
		this.telefonNo = telefonNo;
	}

	public void paraYatýr(double miktar) {
		bakiye += miktar;
		System.out.println("yeni bakiye= " +bakiye);
	}
	
	public void paraÇekme(double miktar) {
		if(miktar>bakiye) {
			System.out.println("bakiye yetersiz");
		}else {
		bakiye -= miktar;
		System.out.println("yeni bakiye = " +bakiye);
	}
	}
	
	public String getHesapNo() {
		return hesapNo;
	}
	public void setHesapNo(String hesapNo) {
		this.hesapNo = hesapNo;
	}
	public double getBakiye() {
		return bakiye;
	}
	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefonNo() {
		return telefonNo;
	}
	public void setTelefonNo(String telefonNo) {
		this.telefonNo = telefonNo;
	}
	

}

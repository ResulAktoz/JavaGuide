package ÝdmanProgramý;

public class Ýdman {
	private int burpeeSayýsý;
	private int pushUpSayýsý;
	private int sitUpSayýsý;
	private int squatSayýsý;
	
	public Ýdman(int burpeeSayýsý, int pushUpSasyýsý, int sitUpSayýsý, int squatSayýsý) {
		super();
		this.burpeeSayýsý = burpeeSayýsý;
		this.pushUpSayýsý = pushUpSasyýsý;
		this.sitUpSayýsý = sitUpSayýsý;
		this.squatSayýsý = squatSayýsý;
	}

	public int getBurpeeSayýsý() {
		return burpeeSayýsý;
	}

	public void setBurpeeSayýsý(int burpeeSayýsý) {
		this.burpeeSayýsý = burpeeSayýsý;
	}

	public int getPushUpSayýsý() {
		return pushUpSayýsý;
	}

	public void setPushUpSasyýsý(int pushUpSasyýsý) {
		this.pushUpSayýsý = pushUpSayýsý;
	}

	public int getSitUpSayýsý() {
		return sitUpSayýsý;
	}

	public void setSitUpSayýsý(int sitUpSayýsý) {
		this.sitUpSayýsý = sitUpSayýsý;
	}

	public int getSquatSayýsý() {
		return squatSayýsý;
	}

	public void setSquatSayýsý(int squatSayýsý) {
		this.squatSayýsý = squatSayýsý;
	}
	public void hareketYap(String hareketTürü, int sayi) {
		if(hareketTürü.equals("burpee")) {
			burpeeYap(sayi);
			
		}else if (hareketTürü.equals("pushUp")) {
			pushUpYap(sayi);
			
		}else if (hareketTürü.equals("sitUp")) {
			sitUpYap(sayi);
			
		}else if (hareketTürü.equals("squat")) {
			squatYap(sayi);
			
		}
		else {
			System.out.println("geçersiz hareket");
		}
		
	}
	public void burpeeYap(int sayi) {
		if(burpeeSayýsý==0) {
			System.out.println("yapacak burpee kalmadý");
		}
		if(burpeeSayýsý-sayi <0) {
			System.out.println("hedeflediðin burpee sayýsýný geçtin tebrikler");
			burpeeSayýsý =0;
		
		}else {
			burpeeSayýsý -= sayi;
			System.out.println("kalan burpee sayýsý : " +burpeeSayýsý);
		}
	}
		public void pushUpYap(int sayi) {
			if(pushUpSayýsý== 0) {
				System.out.println("yapacak burpee kalmadý");
			}
			if(pushUpSayýsý-sayi <0) {
				System.out.println("hedeflediðin burpee sayýsýný geçtin tebrikler");
				burpeeSayýsý =0;
			
			}else {
				pushUpSayýsý -= sayi;
				System.out.println("kalan burpee sayýsý : " +pushUpSayýsý);
			
		
			}

		}
		public void sitUpYap(int sayi) {
			if(sitUpSayýsý== 0) {
				System.out.println("yapacak burpee kalmadý");
			}
			if(sitUpSayýsý-sayi <0) {
				System.out.println("hedeflediðin burpee sayýsýný geçtin tebrikler");
				sitUpSayýsý =0;
			
			}else {
				sitUpSayýsý -= sayi;
				System.out.println("kalan burpee sayýsý : " +sitUpSayýsý);
			
		
			}

		}
		public void squatYap(int sayi) {
			if(squatSayýsý== 0) {
				System.out.println("yapacak burpee kalmadý");
			}
			if(squatSayýsý-sayi <0) {
				System.out.println("hedeflediðin burpee sayýsýný geçtin tebrikler");
				squatSayýsý =0;
			
			}else {
				squatSayýsý -= sayi;
				System.out.println("kalan burpee sayýsý : " +squatSayýsý);
			
		
			}

		}
public boolean idmanBittiMi() {
		return((burpeeSayýsý ==0)&& (pushUpSayýsý==0) && (sitUpSayýsý==0) && squatSayýsý==0);
				
			
		}
	
	
	

			
	

}




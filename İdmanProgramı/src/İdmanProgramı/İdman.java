package �dmanProgram�;

public class �dman {
	private int burpeeSay�s�;
	private int pushUpSay�s�;
	private int sitUpSay�s�;
	private int squatSay�s�;
	
	public �dman(int burpeeSay�s�, int pushUpSasy�s�, int sitUpSay�s�, int squatSay�s�) {
		super();
		this.burpeeSay�s� = burpeeSay�s�;
		this.pushUpSay�s� = pushUpSasy�s�;
		this.sitUpSay�s� = sitUpSay�s�;
		this.squatSay�s� = squatSay�s�;
	}

	public int getBurpeeSay�s�() {
		return burpeeSay�s�;
	}

	public void setBurpeeSay�s�(int burpeeSay�s�) {
		this.burpeeSay�s� = burpeeSay�s�;
	}

	public int getPushUpSay�s�() {
		return pushUpSay�s�;
	}

	public void setPushUpSasy�s�(int pushUpSasy�s�) {
		this.pushUpSay�s� = pushUpSay�s�;
	}

	public int getSitUpSay�s�() {
		return sitUpSay�s�;
	}

	public void setSitUpSay�s�(int sitUpSay�s�) {
		this.sitUpSay�s� = sitUpSay�s�;
	}

	public int getSquatSay�s�() {
		return squatSay�s�;
	}

	public void setSquatSay�s�(int squatSay�s�) {
		this.squatSay�s� = squatSay�s�;
	}
	public void hareketYap(String hareketT�r�, int sayi) {
		if(hareketT�r�.equals("burpee")) {
			burpeeYap(sayi);
			
		}else if (hareketT�r�.equals("pushUp")) {
			pushUpYap(sayi);
			
		}else if (hareketT�r�.equals("sitUp")) {
			sitUpYap(sayi);
			
		}else if (hareketT�r�.equals("squat")) {
			squatYap(sayi);
			
		}
		else {
			System.out.println("ge�ersiz hareket");
		}
		
	}
	public void burpeeYap(int sayi) {
		if(burpeeSay�s�==0) {
			System.out.println("yapacak burpee kalmad�");
		}
		if(burpeeSay�s�-sayi <0) {
			System.out.println("hedefledi�in burpee say�s�n� ge�tin tebrikler");
			burpeeSay�s� =0;
		
		}else {
			burpeeSay�s� -= sayi;
			System.out.println("kalan burpee say�s� : " +burpeeSay�s�);
		}
	}
		public void pushUpYap(int sayi) {
			if(pushUpSay�s�== 0) {
				System.out.println("yapacak burpee kalmad�");
			}
			if(pushUpSay�s�-sayi <0) {
				System.out.println("hedefledi�in burpee say�s�n� ge�tin tebrikler");
				burpeeSay�s� =0;
			
			}else {
				pushUpSay�s� -= sayi;
				System.out.println("kalan burpee say�s� : " +pushUpSay�s�);
			
		
			}

		}
		public void sitUpYap(int sayi) {
			if(sitUpSay�s�== 0) {
				System.out.println("yapacak burpee kalmad�");
			}
			if(sitUpSay�s�-sayi <0) {
				System.out.println("hedefledi�in burpee say�s�n� ge�tin tebrikler");
				sitUpSay�s� =0;
			
			}else {
				sitUpSay�s� -= sayi;
				System.out.println("kalan burpee say�s� : " +sitUpSay�s�);
			
		
			}

		}
		public void squatYap(int sayi) {
			if(squatSay�s�== 0) {
				System.out.println("yapacak burpee kalmad�");
			}
			if(squatSay�s�-sayi <0) {
				System.out.println("hedefledi�in burpee say�s�n� ge�tin tebrikler");
				squatSay�s� =0;
			
			}else {
				squatSay�s� -= sayi;
				System.out.println("kalan burpee say�s� : " +squatSay�s�);
			
		
			}

		}
public boolean idmanBittiMi() {
		return((burpeeSay�s� ==0)&& (pushUpSay�s�==0) && (sitUpSay�s�==0) && squatSay�s�==0);
				
			
		}
	
	
	

			
	

}




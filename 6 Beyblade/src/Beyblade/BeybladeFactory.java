package Beyblade;

public class BeybladeFactory {
	
	public Beyblade makeBeyblade(String beybladeType) {
		
		if(beybladeType.equals("Drayka")) {
			return new Drayka("takao",800,300,"mavi ejderha");
		}else if(beybladeType.equals("Dranza")) {
			return new Dranza("maaakkooaa",700,400,"mavi ejderha");
		}else {
			return null;
		}
		
		
		
	}

}

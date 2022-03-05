package StaticKeyWord;

public class Audience {
	
	private  String name;
	
	private static  int numberOfAudience=0;
	
	

	public Audience(String name) {
		super();
		this.name = name;
		
		numberOfAudience++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	
	public void watchGame() {
		
		System.out.println(name+ " oyun seyrediyor");
	}
	
	public static  int getNumberOfAudience() {
		return numberOfAudience;
	}
	
	}
	



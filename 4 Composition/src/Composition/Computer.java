package Composition;

public class Computer {
	
	private Screen screen;
	private Case case1;
	private MainBoard mainboard;
	
	public Computer() {
		super();
		
	}

	public Computer(Screen screen, Case case1, MainBoard mainboard) {
		super();
		this.screen = screen;
		this.case1 = case1;
		this.mainboard = mainboard;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Monitor monitor) {
		this.screen = screen;
	}

	public Case getCase1() {
		return case1;
	}

	public void setCase1(Case case1) {
		this.case1 = case1;
	}

	public MainBoard getMainboard() {
		return mainboard;
	}

	public void setMainboard(MainBoard mainboard) {
		this.mainboard = mainboard;
	}
	
	
	

}

package Composition;

public class Test {

	public static void main(String[] args) {
		
		Resolution resolution = new Resolution(1920, 1080);
		Screen screen = new Screen("280HZ", "Asus", "24.8", resolution);
		Case case1= new Case("shadow blade", "shadow", "temperli cam");
		MainBoard mainboard = new MainBoard("b250 pro", "ASus", "4", "windows 10");
		Computer computer = new Computer(screen, case1, mainboard);

		computer.getCase1().openComputer();
		computer.getScreen().closeScreen();
		computer.getMainboard().uploadOperatingSystem("ubuntu linux");
	}

}

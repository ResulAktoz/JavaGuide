package AbstractsClasslar;

public class Main {

	public static void main(String[] args) {
		
		//Sekil sekil = new Sekil() {
		//}
		Sekil sekil;
		sekil = new Square("Kare2", 6);
		sekil.calculateArea();
		
		
		Square square1 = new Square("Kare", 5);
		Circle circle1 = new Circle("Daire", 3);
		
		square1.calculateArea();
		circle1.calculateArea();
		square1.calculatePerimeter();;
	}

}

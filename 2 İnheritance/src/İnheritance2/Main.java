package Ýnheritance2;

public class Main {

	public static void main(String[] args) {
		Animal kopek = new Animal("karabaþ",500,1,4);
		Dog karabas= new Dog(kopek,5);
		karabas.showÝnformation();
		karabas.run(10);
		

	}

}

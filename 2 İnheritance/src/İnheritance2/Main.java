package �nheritance2;

public class Main {

	public static void main(String[] args) {
		Animal kopek = new Animal("karaba�",500,1,4);
		Dog karabas= new Dog(kopek,5);
		karabas.show�nformation();
		karabas.run(10);
		

	}

}

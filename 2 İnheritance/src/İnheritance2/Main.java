package İnheritance2;

public class Main {

	public static void main(String[] args) {
		Animal kopek = new Animal("karabaş",500,1,4);
		Dog karabas= new Dog(kopek,5);
		karabas.showİnformation();
		karabas.run(10);
		

	}

}

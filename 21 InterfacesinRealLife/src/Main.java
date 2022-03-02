
public class Main {

	public static void main(String[] args) {
		SignUpManager signUpManager = new SignUpManager(new AgeUserCheckService());
		SignUpManager signUpManager2 = new SignUpManager(new ComplexUserCheckService());
		
		
		signUpManager2.signUp(new User(1, "Resul", 20));
		signUpManager.signUp(new User(2,"Sinem",17));

	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int girisHakki= 3;
		String kullan�c�Ad� = "ResulAktoz";
		String parola = "12345";
		
		while(true){
			System.out.println("kullan�c� ad�: ");
			String kullan�c� = scanner.next();
			System.out.println("parola: ");
			String kullan�c�Parola = scanner.next();
			
			if(kullan�c�.equals(kullan�c�Ad�) && kullan�c�Parola.equals(parola)) {
				System.out.println("ho�geldiniz " +kullan�c�Ad�);
				break;
			}else if(kullan�c�.equals(kullan�c�Ad�) && !kullan�c�Parola.equals(parola)) {
				System.out.println("parola yanl��");//�nlemle yanl�� ise do�ruya d�n��t�rm�� oluyoruz
				girisHakki--;
				System.out.println(+girisHakki+" giri� hakk�n�z kald�.");
				
			}else if(!kullan�c�.equals(kullan�c�Ad�) && kullan�c�Parola.equals(parola)) {
				System.out.println("Kullan�c� ad� yanl��");
				girisHakki--;
			}else {
				System.out.println("kullan�c� ad�n�z ve parola yanl��");
				girisHakki--;
				
			}
				if(girisHakki==0) {
					System.out.println("giri� hakk� bitti sonra tekrar deneyin");
				break;
				}
		}
	}

}

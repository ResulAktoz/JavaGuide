import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int girisHakki= 3;
		String kullanýcýAdý = "ResulAktoz";
		String parola = "12345";
		
		while(true){
			System.out.println("kullanýcý adý: ");
			String kullanýcý = scanner.next();
			System.out.println("parola: ");
			String kullanýcýParola = scanner.next();
			
			if(kullanýcý.equals(kullanýcýAdý) && kullanýcýParola.equals(parola)) {
				System.out.println("hoþgeldiniz " +kullanýcýAdý);
				break;
			}else if(kullanýcý.equals(kullanýcýAdý) && !kullanýcýParola.equals(parola)) {
				System.out.println("parola yanlýþ");//ünlemle yanlýþ ise doðruya dönüþtürmüþ oluyoruz
				girisHakki--;
				System.out.println(+girisHakki+" giriþ hakkýnýz kaldý.");
				
			}else if(!kullanýcý.equals(kullanýcýAdý) && kullanýcýParola.equals(parola)) {
				System.out.println("Kullanýcý adý yanlýþ");
				girisHakki--;
			}else {
				System.out.println("kullanýcý adýnýz ve parola yanlýþ");
				girisHakki--;
				
			}
				if(girisHakki==0) {
					System.out.println("giriþ hakký bitti sonra tekrar deneyin");
				break;
				}
		}
	}

}


public class SignUpManager {
	private UserCheckService userCheckService;
	
	
	public SignUpManager(UserCheckService userCheckService) {
		super();
		this.userCheckService = userCheckService;
	}
	public void signUp(User user) {
		
        if(userCheckService.checkUser(user)) {
			
			System.out.println("Kullan�c� kay�t oldu: " +user.getName());
		}else {
		System.out.println("Kay�t olamad�: " +user.getName());
		
		
		
	}
		
		
	}
	
	

}

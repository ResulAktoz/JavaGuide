
public class SignUpManager {
	private UserCheckService userCheckService;
	
	
	public SignUpManager(UserCheckService userCheckService) {
		super();
		this.userCheckService = userCheckService;
	}
	public void signUp(User user) {
		
        if(userCheckService.checkUser(user)) {
			
			System.out.println("Kullanýcý kayýt oldu: " +user.getName());
		}else {
		System.out.println("Kayýt olamadý: " +user.getName());
		
		
		
	}
		
		
	}
	
	

}

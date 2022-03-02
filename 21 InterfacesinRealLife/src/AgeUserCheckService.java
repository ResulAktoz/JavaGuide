
public class AgeUserCheckService implements UserCheckService {

	//method
	@Override
	public boolean checkUser(User user) {
			
			if(user.getAge()>=18) {
				return true;
			}
			return false;
		
	}
	
	
	


}

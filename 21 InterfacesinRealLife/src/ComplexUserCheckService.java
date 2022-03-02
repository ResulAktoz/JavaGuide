
public class ComplexUserCheckService implements UserCheckService {

	@Override
	public boolean checkUser(User user) {
		if(user.getAge()>=18 && user.getName().startsWith("Re")) {
			return true;
		}
		return false;
	}
	


}

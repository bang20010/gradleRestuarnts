package User;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements userService
{
	User user = new User();

	
	@Override
	public String createUser(long signupNum, String id, String pw , String address, String email, String phone,Timestamp signupDate) {
		
		
		user.setId(id);
		user.setPw(pw);
		user.setAddress(address);
		user.setPhone(phone);
		user.setSignupDate(signupDate);
		
		return user.toString();
	}

	@Override
	public List<User> getUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void searchUserId(long signupNum, Map<String, String> Users) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> searchUserPw(long signupNum, Map<String, String> Users) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(long signupNum, Map<String, String> Users) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUserr(long signupNum, Map<String, String> Users) {
		// TODO Auto-generated method stub
		
	}

}

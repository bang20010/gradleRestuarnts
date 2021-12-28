package User;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface userService {
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String createUser(long signupNum,String id,String pw,String address,String email,String phone,Timestamp signupDate);
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public List<User> getUser();
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public void searchUserId(@PathVariable long signupNum, @RequestParam Map<String, String> Users);
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public List<User> searchUserPw(@PathVariable long signupNum, @RequestParam Map<String, String> Users);
	
	@RequestMapping(value = "/user", method = RequestMethod.PUT)
	public void updateUser(@PathVariable long signupNum, @RequestParam Map<String, String> Users);
	
	@RequestMapping(value = "/user", method = RequestMethod.DELETE)
	public void deleteUserr(@PathVariable("signupNum") long signupNum , @RequestParam Map<String, String> Users);
	
	
}

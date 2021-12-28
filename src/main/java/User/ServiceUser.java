package User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ServiceUser {
	
	
	 @Autowired
	 private UserRepository userRepository;
	 
	    public Long join(User user) {
	    	return user.getSignupNum();
	    }
}


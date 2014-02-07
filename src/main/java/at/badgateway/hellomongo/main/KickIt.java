package at.badgateway.hellomongo.main;

import lombok.Setter;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import at.badgateway.hellomongo.domain.User;
import at.badgateway.hellomongo.repository.UserRepository;

public class KickIt implements InitializingBean {

	@Setter @Autowired UserRepository userRepository;

	@Override
	public void afterPropertiesSet() throws Exception {

		User user = new User();
		user.setFirstname("hans");
		user.setLastname("maier");
		user.setImage("this could be a image but is a string :-P".getBytes());

		userRepository.save(user);

	}

}

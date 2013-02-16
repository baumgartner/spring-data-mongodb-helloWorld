package at.badgateway.hellomongo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import at.badgateway.hellomongo.domain.User;
import at.badgateway.hellomongo.repository.UserRepository;

public class KickIt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create and configure beans
		ApplicationContext context =
		    new ClassPathXmlApplicationContext("context.xml");

		// retrieve configured instance
		UserRepository userRepository = context.getBean("userRepository", UserRepository.class);
		
		User user = new User();
		user.setFirstname("hans");
		user.setLastname("maier");
		user.setImage("this could be a image but is a string :-P".getBytes());
		
		userRepository.save(user);
	}

}

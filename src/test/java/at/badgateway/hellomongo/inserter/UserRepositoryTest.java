package at.badgateway.hellomongo.inserter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import at.badgateway.hellomongo.domain.User;
import at.badgateway.hellomongo.repository.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:context.xml" })
public class UserRepositoryTest {
	
	@Autowired
	private UserRepository userRepository;
	@Test
	public void insertUser(){
		User u = new User();
		u.setFirstname("alf");
		u.setLastname("kühbauer");
		userRepository.save(u);
	}

}

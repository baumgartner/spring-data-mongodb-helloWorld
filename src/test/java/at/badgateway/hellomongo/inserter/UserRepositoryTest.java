package at.badgateway.hellomongo.inserter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import at.badgateway.hellomongo.domain.User;
import at.badgateway.hellomongo.repository.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:context.xml" })
public class UserRepositoryTest {
	
	private Logger logger =LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	ApplicationContext context;
	
	@Test
	public void insertUser(){
		User u = new User();
		u.setFirstname("alf");
		u.setLastname("kühbauer");
		userRepository.save(u);
	}
	
	@Test
	public void enablesAuditingAndSetsPropertiesAccordingly() {

		User u = new User();
		BeforeConvertEvent<User> event = new BeforeConvertEvent<User>(u);
		context.publishEvent(event);

		logger.debug("entity: {}", u);

		event = new BeforeConvertEvent<User>(u);
		context.publishEvent(event);

		logger.debug("entity: {}", u);

	}	
}

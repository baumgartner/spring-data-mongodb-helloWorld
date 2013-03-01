package at.badgateway.hellomongo.inserter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import at.badgateway.hellomongo.domain.User;
import at.badgateway.hellomongo.repository.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:context.xml" })
public class TestDataInserter {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void dataInserter() {
		Collection<User> allUsers = new ArrayList<User>();

		for (int i = 0; i < 100; i++) {
			allUsers.add(createUser(i));
		}

		userRepository.save(allUsers);
	}

	private User createUser(int i) {
		User user = new User();
		user.setFirstname("hans" + i);
		user.setLastname("maier" + i);
		user.setImage("this could be a image but is a string :-P".getBytes());

		user.setTags(new HashSet<String>());
		user.getTags().add("tag" + i % 20);
		user.getTags().add("andererTag" + i % 20);
		user.getTags().add("mayerTag" + i % 20);

		return user;
	}
}

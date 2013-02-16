package at.badgateway.hellomongo.repository;

import org.springframework.data.repository.CrudRepository;

import at.badgateway.hellomongo.domain.User;

public interface UserRepository extends CrudRepository<User, Long>{

}

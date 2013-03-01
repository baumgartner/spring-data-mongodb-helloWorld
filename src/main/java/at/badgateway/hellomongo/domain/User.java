package at.badgateway.hellomongo.domain;

import java.util.Set;

import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedDate;

import lombok.Data;

@Data
public class User {
	private String firstname;
	private String lastname;
	private byte[] image;

	private Set<String> tags;
	
	@CreatedDate
	private DateTime created; 
}

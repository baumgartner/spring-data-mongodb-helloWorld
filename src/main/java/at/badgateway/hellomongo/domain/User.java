package at.badgateway.hellomongo.domain;

import java.util.Set;

import lombok.Data;

import org.springframework.data.annotation.CreatedDate;

@Data
public class User {
	private String firstname;
	private String lastname;
	private byte[] image;

	private Set<String> tags;
	
	@CreatedDate
	private Long created; 
}

package at.badgateway.hellomongo.support;

import org.springframework.data.domain.AuditorAware;

public class Auditor implements AuditorAware<String> {

	public String getCurrentAuditor() {
		return "AuditorString";
	}

}

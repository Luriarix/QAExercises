package exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
	public boolean isValidEmail(String email) {
		String domain = email.split("@")[1];
		Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
		
		if (domain.contains(".") != true ) {
			return false;
		}
		
		int count = 0;
		for (int i = domain.length() - 1; i >= 0; i--) {
			if (count > 3) {
				return false;
			}
			if (domain.charAt(i) != '.') {
				count++;				
			}
			if (domain.charAt(i) == '.') {
				break;
			}
		}

		
		if (email.split("@")[0].length() == 0) {
			return false;
		}
		
		Matcher emailHasSpecialCharacters = special.matcher(email.split("@")[0]);
		Matcher domainHasSpecialCharacters = special.matcher(domain);		

		if (emailHasSpecialCharacters.find() || domainHasSpecialCharacters.find()) {
			return false;
		}
		
		return true;
	}
	
}

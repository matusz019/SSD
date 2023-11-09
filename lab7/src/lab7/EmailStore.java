/**
 * @author MChetkowski
 *
 */
package lab7;

import java.util.HashSet;
import java.util.Set;

public class EmailStore {
	/**
	 * A set of known email addresses
	 */
	Set<String> emailAddresses = new HashSet<String>();
	
	/**
	 * Adds an email addr to the set of known emails
	 * @param email
	 */

	public boolean addEmail(String email) {
		if (emailAddresses.contains(email)) {
			return false;
		}else {
			emailAddresses.add(email);
			return true;
		}
	}
	
	/**
	 * Checks if an email addr is known
	 * @param email
	 * @return true if known
	 */
	public boolean hasEmail(String email) {
		return emailAddresses.contains(email);
	}
	
	public void displayEmails() {
		System.out.println("The email addresses are as follows - ");
		for(String email : emailAddresses) {
			System.out.println(email);
		}
	}
	
}

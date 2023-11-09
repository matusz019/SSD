/**
 * @author MChetkowski
 *
 */
package lab7;

public class Driver {

	public static void main(String[] args) {
		EmailStore store = new EmailStore();
		store.addEmail("matusz019@gmail.com");
		store.addEmail("matusz019@gmail.com");
		store.addEmail("j.kozlowska01@gmail.com");
		store.addEmail("m.chetkowski01@gmail.com");
		store.addEmail("A.Barlow01@gmail.com");
		store.hasEmail("j.kozlowska01@gmail.com");
		store.displayEmails();
		

	}

}

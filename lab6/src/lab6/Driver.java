/**
 * 
 */
package lab6;

/**
 * @author MChetkowski
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NameManager manager = new NameManager();
		
		manager.addName("M.Mickleson");
		manager.addName ("Johnua Taylor Biggs");
		manager.addName ("P.Smith");
		manager.addName ("Peter Jonathan Smythton");
		manager.addName ("P.Thompson");
		manager.printNames(); 
		manager.removeLongNames();
		System.out.println("----------------");
		manager.printNames();

	}

}

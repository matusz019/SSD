/**
 * 
 */
package lab6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author MChetkowski
 *
 */
public class NameManager {
	
	List<String> names = new ArrayList<String>();
	
	public void addName(String name) {
		names.add(name);
	}
	public void printNames() {
		for(String name: names) {
			System.out.println(name);
		}
	}
	public void removeLongNames() {
		Iterator<String> iter = names.iterator();
		for (int i = 0; i< names.size(); i++) {
			
			if(iter.next().length()>15) {
				
				iter.remove();
			}
		}
	}
}
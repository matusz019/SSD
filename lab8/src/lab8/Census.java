/**
 * 
 */
package lab8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MChetkowski
 *
 */
public class Census {
	private List<Person> people = new ArrayList<Person>();
	
	void addPerson(Person person) {
		people.add(person);
	}
	boolean removePerson(Person person) {
		if (people.contains(person)){
			people.remove(person);
			return true;
		}else {
			return false;
		}
	}
	int countPeople() {
		int count = 0;
		for (int i=0;i < people.size() ;i++) {
			count = count + 1;
		}
		return count;
	}
	
	int countMales() {
		int countMales = 0;
		for(Person person : people) {
			if (person.Gender() == true){
				countMales ++;
			}
		}
		return countMales;
	}
	
	int countFemales() {
		int countFemales = 0;
		for(Person person : people) {
			if (person.Gender() == false){
				countFemales ++;
			}
		}
		return countFemales;
	}
	public String toString() {
		String details = null;
		for (Person person : people) {
			details = person.toString();
			System.out.println(details);
			
		}
		return details;
	}
	
	void sortOnAge() {
		
	}
	void sortOnHeight() {
		
	}
	void sortOnGender() {
		
	}

	
}

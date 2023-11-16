/**
 * 
 */
package lab8;

/**
 * @author user
 *
 */
public class CensusDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Census census = new Census();
		Person person1 = new Person(180, 19, true);
		Person person2 = new Person(190, 18, true);
		Person person3 = new Person(140, 20, true);
		Person person4 = new Person(160, 21, false);
		Person person5 = new Person(120, 22, false);
		
		census.addPerson(person1);
		census.addPerson(person2);
		census.addPerson(person3);
		census.addPerson(person4);
		census.addPerson(person5);
		
		System.out.println(census.countPeople());
		System.out.println(census.countMales());
		System.out.println(census.countFemales());
		
		System.out.println("---------------------------");
		
		census.removePerson(person1);
		System.out.println(census.countPeople());
		System.out.println(census.countMales());
		System.out.println(census.countFemales());
		System.out.println(census.toString());
	}

}

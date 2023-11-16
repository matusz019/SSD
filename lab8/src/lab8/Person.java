/**
 * 
 */
package lab8;

/**
 * @author MChetkowski
 *
 */
public class Person {
	private float height;
	private int age;
	private boolean gender;
	private String genderString;
	/**
	 * @return the height
	 */
	public float getHeight() {
		return height;
	}
	
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * @return the age
	 */
	
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * @return the gender true=male false= female
	 */
	public boolean Gender() {
		return gender;
	}
	
	/**
	 * @param gender the gender to set
	 */
	public void setGender(boolean gender) {
		this.gender = gender;
		if (gender == true){
			genderString = "Male";
			
		}
		else {
			genderString = "Female";
		}
	}
	
	public Person(float height, int age, boolean gender) {
		this.height = height;
		this.age = age;
		this.gender = gender;
	}
	
	public String toString() {
		String personData = "Height = " + height + " Age = " + age + " Gender = " + genderString;
		return personData;
	}
}

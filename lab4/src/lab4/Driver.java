package lab4;

public class Driver {

	public static void main(String[] args) {

		ArrayProcessor ap = new ArrayProcessor();
		
		int len = ap.getArrayLength(new String[] {"one", "two", "three"});

		System.out.println("Array length is " +len);

		
		Menu m = new Menu();
		
		try {
			m.displayMenuOption(1);
			m.displayMenuOption(2);
			m.displayMenuOption(3);
			m.displayMenuOption(4);
			
		} catch (InvalidOptionException e) {
			
			System.err.println("Menu option invalid: " + e.getMessage());
		}
	}

}

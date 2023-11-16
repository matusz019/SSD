package lab8pt2;

public class NumberCheckerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberChecker numChecker = new NumberChecker ();
		int max = numChecker.findMax(new Integer[] {5,2,7,9,10,1,2});
		System.out.println("Max number is " + max);
		//The growth function is linear, and the order is O(n).
	}

}
